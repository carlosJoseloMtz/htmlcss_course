
BLOG.jQuery = {};

BLOG.jQuery.slider = {

		iterarEnIntervalo: function() {
			var seconds = 2 * 1000;
			setInterval(BLOG.jQuery.slider.iterarImagen, seconds);
		},
		
		printedAlready: false,

		iterarImagen: function() {
			// console.log('entra a la funcion')
			// define el conjunto de imágenes para trabajar
			var imageSet = [BLOG.global.resourcePath + "/images/google_maps.png", 
			                BLOG.global.resourcePath + "/images/images.jpg", 
			                BLOG.global.resourcePath + "/images/go_image.png"];
			// jquery selector
			// $("#image")
			// imagen representada en un objeto de jQuery
			var imagenJQuery = $("#image");
			
			
			/**
			 * cuando hacen una asignación de una búsqueda de un elemento con jquery
			 * el resultado será un objeto de jquery ([arreglo de elementos encontrados],
			 * context, length (cantidad de elementos encontrados), ...)
			 * Si se usa directamente $('...) retorna el objeto DOM
			 */
			
			// obtiene el objeto DOM (como usar document.getElementBy..)
			var imagenDOM = $(imagenJQuery)[0];
			
			
			// control + shift + C para comentar código
			if (!BLOG.jQuery.slider.printedAlready) {
//				console.log('jQuery object');
//				console.log(imagenJQuery);
//				console.log('imagen dom object');
//				console.log(imagenDOM);
//				BLOG.jQuery.slider.printedAlready = true;
//				console.log('javascript selector');
//				console.log(document.getElementById('image'));
			}
			
			var imagen = imagenDOM;
			var limite = imageSet.length;
			
			// $.    <<== se refiere a que requiere una función ya implementada en jQuery
			// each abstrae el comportamiento de un for
			// each se ocupará de iterar entre todos los elementos contenidos en imageSet
			// indice es la posición en el ciclo
			// elemento es el elemento actual (var elemento = imageSet[indice];)			
			$.each(imageSet, function(indice, currentImage) {

				// si la imagen actual en el ciclo es la que se está desplegando
				if (currentImage == imagen.src) {
					// si es la última posición
					if (indice == (limite - 1)) {
						// pasar la primer imagen
						imagen.src = imageSet[0];
					} else {
						// pasar la siguiente imagen
						imagen.src = imageSet[indice + 1];
					}
					return false;
					// se va a la siguiente iteración, ignorando el código que falte abajo
					// continue;
					// sin importar la posición, se rompe el ciclo
					// break;
				}
			});
//			
//			continue, hace el salto a la siguiente iteración
//			
//			for (var ejemplo = 0; ejemplo < 10; ejemplo = ejemplo + 1) {
//				console.log('antes de')
//				
//				if (ejemplo > 3) {
//					continue;
//				}
//				
//				console.log(ejemplo);
//			}
			
			// indice no tiene validez aquí afuera (undefined)
			// control + shift + c     [comentar o descomentar]
		}
}


// toma el objeto document
// ready = cuando esté listo
$(document).ready(function() {
	BLOG.jQuery.slider.iterarEnIntervalo();
	
	$('ul.collaborator-list li').click(function() {
		alert($(this).text())
	});
});


