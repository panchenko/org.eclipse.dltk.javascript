var svg = xhtml..svgns::svg;


document.write (xmlMusic.music[1].*); 


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


var svg = xhtml..svgns::svg;
	 		
var xml2 =
	<language>JavaScript</language>;
	 		
default xml namespace = "http://www.w3.org/1999/xhtml";

// No need now to specify a namespace in the html tag

var xhtml = <html><head><title></title></head><body>
            <p>text</p></body></html>;

