
public class EjecutorFactory {

	public static void main(String[] argument) {
		OperadorAritmeticoFactory operadorFactory = new OperadorAritmeticoFactory();
		
		
		OperacionAritmetica operador = operadorFactory.obtenerOperacion("suma");
		
		int resultadoOperacion = operador.ejecutarOperacion(7, 7);
		
		System.out.println(resultadoOperacion);
	}
}
