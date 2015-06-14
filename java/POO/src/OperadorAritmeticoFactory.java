
public class OperadorAritmeticoFactory {

	public OperacionAritmetica obtenerOperacion(String tipoDeOperacion) {
		OperacionAritmetica operacion = null;
		
		// equals (para los strings) compara el contenido en la cadena (texto)
		if (tipoDeOperacion.equals("resta")) {
			operacion = new Resta();
		}
		if (tipoDeOperacion.equals("suma")) {
			operacion = new SumaAritmetica();
		}
		
		// TODO: instanciar el objeto
		return operacion;
	}
	
}
