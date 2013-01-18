var fs = require('fs');

function trim(str) {
  return str.replace(/^\s\s*/, '').replace(/\s\s*$/, '');
}

function replaceStatic(contents, body) {
  return contents.replace(/(static\s*\{)[\s\S]+?(\})/m, '$1\n' + body + '\t$2');
}

function replaceHandle(contents, body) {
  return contents.replace(/(switch\s*\(\w+\)\s*\{)[\s\S]+?(\})/m, '$1\n' + body + '\t\t$2');
}

function joinLines(lines, indent) {
  return indent + lines.join('\n' + indent) + '\n';
}

var visitorFile = __dirname + '/../src/org/eclipse/dltk/javascript/ast/ASTVisitor.java';
var contents = fs.readFileSync(visitorFile, 'UTF-8');
contents = replaceStatic(contents, '');
contents = replaceHandle(contents, '');

var matches = [];
var methodPattern = /public\s+(abstract\s+)?E\s+(visit\w+)\(\s*(\w+)\s+\w+\)/g;
var m;
while (m = methodPattern.exec(contents)) {
  if (m[3] == 'ASTNode') {
    continue; // skip visitUnknownNode
  }
  matches.push({method: m[2], type: m[3] });
}
console.log('Number of matched methods: ' + matches.length);

var staticInit = [];
for (var i in matches) {
  staticInit.push('HANDLERS.put(' + matches[i].type + '.class, ' + i + ');');
}
var handle = [];
for (var i in matches) {
  handle.push('case ' + i + ':');
  handle.push('\treturn ' + matches[i].method + '((' + matches[i].type + ') node);');
}

var newContents = contents;
newContents = replaceStatic(newContents, joinLines(staticInit, '\t\t'));
newContents = replaceHandle(newContents, joinLines(handle, '\t\t'));

fs.writeFileSync(visitorFile, newContents, 'UTF-8');
