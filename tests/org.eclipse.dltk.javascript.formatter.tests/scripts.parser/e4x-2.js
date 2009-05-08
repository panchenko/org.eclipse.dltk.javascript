

//var languages = new XML('<languages type="dynamic"><lang>JavaScript</lang><lang>Python</lang></languages>');


var languages2 = 
 <languages type="dynamic">
   <lang default=true>JavaScript</lang>
   <lang>Python</lang>
 </languages>;
 
/* 
var h = 'html';
var text = "Here's some text";
var doc = <{h}><body>{text}</body></{h}>;
alert(doc.toXMLString());
// Gives 
<html>
  <body>Here's some text</body>
</html>


 var a = 2;
 var b = <foo bar={a}>"hi"</foo>;
 
 var b = 'He said "Don\'t go there."';
var el = <foo a={b}/>;
alert(el.toXMLString());
// Gives: <foo a="He said &quot;Don't go there.&quot;"/>


var a = 'att';
var b = <b {a}='value'/>;
alert(b);
// Gives:
<b att="value"/>

var person = <person>
  <name>Bob Smith</name>
  <likes>
    <os>Linux</os>
    <browser>Firefox</browser>
    <language>JavaScript</language>
    <language>Python</language>
  </likes>
</person>;

alert(person.name); // Bob Smith
alert(person['name']); // Bob Smith
alert(person.likes.browser); // Firefox
alert(person['likes'].browser); // Firefox

 var xmllist = <>
   <lang>JavaScript</lang>
   <lang>Python</lang>
 </>;
 
 
  var languages = <languages>
   <lang>JavaScript</lang>
   <lang>Python</lang>
 </languages>;
 
 var lang = languages.lang;
 alert(lang.length()); // Alerts 2
 
 languages.lang += <lang>Ruby</lang>;
 alert(lang.length()); // Still alerts 2
 
 lang = languages.lang; // Re-create the XMLList
 alert(lang.length()); // Alerts 3
 
 
 languages.lang += <lang>Ruby</lang>;
 
 
 var html = <html>
  <p id="p1">First paragraph</p>
  <p id="p2">Second paragraph</p>
</html>;

alert(html.p.(@id == "p1")); // Alerts "First paragraph"


var people = <people>
  <person>
    <name>Bob</name>
    <age>32</age>
  </person>
  <person>
    <name>Joe</name>
    <age>46</age>
  </person>
</people>;

alert(people.person.(name == "Joe").age); // Alerts 46


default xml namespace = "http://www.w3.org/1999/xhtml";
// No need now to specify a namespace in the html tag
var xhtml = <html><head><title></title></head><body>
            <p>text</p></body></html>;
alert(xhtml.head); // No need to specify a namespace on subelements here either


var xhtml = <html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>Embedded SVG demo</title>
	</head>
	<body>
		<h1>Embedded SVG demo</h1>
		<svg xmlns="http://www.w3.org/2000/svg" 
			viewBox="0 0 100 100">
			<circle cx="50"
				cy="50"
				r="20"
				stroke="orange"
				stroke-width="2px"
				fill="yellow" />
		</svg>
	</body>
</html>;

alert(xhtml.name().localName); // Alerts "html"
alert(xhtml.name().uri); // Alerts "http://www.w3.org/1999/xhtml"

var svg = xhtml..svgns::svg;
alert(svg); // Shows the <svg> portion of the document



var sql = <t>
SELECT *
FROM EMP
</t>

alert(sql);

alert(<>
AB
CD
</>);

var sales = <sales vendor="John">
    <item type="peas" price="4" quantity="6"/>
    <item type="carrot" price="3" quantity="10"/>
    <item type="chips" price="5" quantity="3"/>
  </sales>;
 
alert( sales.item.(@type == "carrot").@quantity );
alert( sales.@vendor );
for each( var price in sales..@price ) {
  alert( price );
}

delete xmlMusic.music.song[1] ;
document.write (xmlMusic.music[1].*); 

var xmlMusic=new XML() ;
   xmlMusic = <mp3>
      <music genre="classical">
         <artist>Ludwig van Beethoven</artist>
         <song>Fifth Symphony</song>
      </music>
      <music genre="jazz">
         <artist>Grover Washington, Jr.</artist>
         <song>The Best Is Yet to Come</song>
      </music>
      <music genre="classical">
         <artist>Johann Sebastian Bach</artist>
         <song>Double Concerto in D- for Two Violins</song>
      </music>
      <music genre="jazz">
         <artist>Dave Brubeck</artist>
         <song>Take Five</song>
         <song>Truth Is Fallen</song>
      </music>
      <music genre="classical">
         <artist>Johannes Brahms</artist>
         <song>Piano Sonata No. 1 in C major</song>
      </music>
   </mp3>;
   
document.write (xmlMusic.music.(@genre=="jazz") );
   */
   
