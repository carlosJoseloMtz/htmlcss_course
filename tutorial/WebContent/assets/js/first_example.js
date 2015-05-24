

function imprimirMensajeEnConsola() {
	console.log('este es un mensaje');
}

function validarCorreo() {
	console.log('validando correo')
	// TODO: implementar validación de correo4
	var email = document.getElementById("email-field");
	var emailValue = email.value;
	
	var correoValido = true;
	
	// console.log(email.value)
	// checa si el texto tiene arroba para ver si es un correo
	if (emailValue.indexOf("@") == -1) {
		correoValido = false;
	}
	
	// tiene si a caso el texto .com
	if (emailValue.indexOf(".com") == -1) {
		correoValido = false;
	}
	
	// validar que esté en la última posición
	// 11 - 7 = 4
	// my@algo.com
	var posicionCom = emailValue.indexOf(".com");
	var longitudCadena = emailValue.length;
	var diferenciaPosiciones = longitudCadena - posicionCom;
	if (diferenciaPosiciones != 4) {
		correoValido = false;
	}
	
	console.log(correoValido);
	
	return correoValido;
}
