
contador=0;
var imagenes=["file:///C:/Users/Usuario%207/Documents/GitHub/htmlcss_course/rafael(ccarlos)/WebContent/assets/images/f1.png",
	"file:///C:/Users/Usuario%207/Documents/GitHub/htmlcss_course/rafael(ccarlos)/WebContent/assets/images/f2.jpg",
	"file:///C:/Users/Usuario%207/Documents/GitHub/htmlcss_course/rafael(ccarlos)/WebContent/assets/images/f3.jpg",
	"file:///C:/Users/Usuario%207/Documents/GitHub/htmlcss_course/rafael(ccarlos)/WebContent/assets/images/f4.jpg",
	"file:///C:/Users/Usuario%207/Documents/GitHub/htmlcss_course/rafael(ccarlos)/WebContent/assets/images/f5.jpg"];

function btn(){
	 var  cambio=document.getElementById("image");
	 if (cambio.src=="file:///C:/Users/Usuario%207/Documents/GitHub/htmlcss_course/rafael(ccarlos)/WebContent/assets/images/f1.png") {

			cambio.src=imagenes[1]
			}
			else 
				cambio.src=imagenes[0]
			
			//cambio.src=imagenes[6];	
					 	
			}
function sliderCambio(){
	var  a=document.getElementById("sliderImg");	
		a.src=imagenes[contador];
		if (contador>=4){
		contador=0;
	}			
	contador ++;	  			  	
	  }
	  setInterval('sliderCambio()',1000)