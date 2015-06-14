
public class EjecutorDeOperacionAritmetica {
	
	public static void main(String[] fdsoahfds) {
		// se puede utilizar la clase sin la interface y todo funciona bien
		// pero no tendría sentido haber creado la interface
//		Resta resta = new Resta();
//		
//		int resultadoResta = resta.ejecutarOperacion(5,  3);
//		System.out.println(resultadoResta);
		
		
		// genero una instancia de mi clase resta pero asignada al papa
		OperacionAritmetica operador = new Resta();
		
		// ejecuto mi método
		int resultadoResta = operador.ejecutarOperacion(6,  2);
		
		System.out.println(resultadoResta);
		
		
		
		OperacionAritmetica operadorSuma = new SumaAritmetica();
		
		int resultadoSuma = operadorSuma.ejecutarOperacion(6, 6);
		
		System.out.println(resultadoSuma);
		
		
	}

}
