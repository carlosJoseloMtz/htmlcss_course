// .slider se refiere a que utilizará
// sólo el contexto del componente web slider
BLOG.slider = {
		iterarEnIntervalo: function() {
			var seconds = 2 * 1000;
			setInterval(BLOG.slider.iterarImagen, seconds);
		},
		
		iterarImagen: function() {
			// console.log('entra a la funcion')
			// define el conjunto de imágenes para trabajar
			var imageSet = [BLOG.global.resourcePath + "/images/google_maps.png", 
			                BLOG.global.resourcePath + "/images/images.jpg", 
			                BLOG.global.resourcePath + "/images/go_image.png"];
			
			var imagen = document.getElementById("image");
			var limite = imageSet.length;
			// declarar la variable en el for para que sólo sea utilizada dentro de este
			for (var indice = 0; indice < limite ; indice = indice + 1) {
				
				// si la imagen actual en el ciclo es la que se está desplegando
				if (imageSet[indice] == imagen.src) {
					// si es la última posición
					if (indice == (limite - 1)) {
						// pasar la primer imagen
						imagen.src = imageSet[0];
					} else {
						// pasar la siguiente imagen
						imagen.src = imageSet[indice + 1];
					}
					break;
				}
			}
			// indice no tiene validez aquí afuera (undefined)
			// control + shift + c     [comentar o descomentar]
		}
}


BLOG.slider.iterarEnIntervalo();

