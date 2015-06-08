
public class Suma {

	// <tipo de visivilidad del método/clase> <tipo de resultado a retornar [void es que no retorna nada]> <nombre del método>
	
	// () - (<tipo de dato> <nombre de la variable>)
	
	
	
	public int sumar(int num1, int num2) {
		// <tipo de dato> <nombre de la variable>
		int resultado = 0;
		resultado = num1 + num2;
		return resultado;		
	}
	
	// override le dice al compilador que vamos a sobreescribir el método del padre
	@Override
	public String toString() {
		String texto = "Este es un objeto de tipo suma";
		return texto;
	}
	
}
