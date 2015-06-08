
public class Ejecutor {
	
	
	// ejecuta cualquier cosa desde aqui
	public static void main(String[] arguments) {
		// inicializar un objeto
		// = new <Tipo de dato - nombre de la clase>();
		Suma suma = new Suma();
		
		int resultadoSuma = suma.sumar(6, 7);
		
		System.out.println(resultadoSuma);
		
		
		System.out.println(suma);
	}

}
