
//let x=6, y=7;


o = {
  a:7,
  get b() { return this.a+1; },
  set c(x) { this.a = x/2; }
};

var o = {
  get latest () {
    if (this.log.length > 0) {
      return this.log[this.log.length - 1];
    }
    else {
      return null;
    }
  },
  get first () {
  	return null;
  },
  log: []
}

var o = {
		  set current (str) {
		    return this.log[this.log.length] = str;
		  },
		  log: []
		}

o = {
		  a:7,
		  get b() { return this.a+1; },
		  set c(x) { this.a = x/2; }
		};