//	var imagenes=["../images/slider.jpg","../images/slider1.jpg", "../images/slider2.jpg", "../images/slider3.jpg"];
var img=document.getElementById("img1");
var arrayImagenes = ["file:///C:/Users/Usuario%207/Documents/GitHub/htmlcss_course/karem/WebContent/assets/image/slider.jpg",
	"file:///C:/Users/Usuario%207/Documents/GitHub/htmlcss_course/karem/WebContent/assets/image/slider1.jpg",
	"file:///C:/Users/Usuario%207/Documents/GitHub/htmlcss_course/karem/WebContent/assets/image/slider2.jpg",
	"file:///C:/Users/Usuario%207/Documents/GitHub/htmlcss_course/karem/WebContent/assets/image/slider3.jpg"];
var contador = 0;
 
 function cambiar(){
				
  		img.src=arrayImagenes[contador];
	
}
 function avanzaSlide(){
       

   cambiar();
	contador = (contador + 1);
	  if (contador==4){
	 	 contador=0;
	 }
	     
	
	   
}

setInterval('avanzaSlide()',2000);