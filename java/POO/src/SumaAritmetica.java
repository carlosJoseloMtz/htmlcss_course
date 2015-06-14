
public class SumaAritmetica implements OperacionAritmetica {

	@Override
	public int ejecutarOperacion(int num1, int num2) {
		// <tipo de dato> <nombre de la variable>
		int resultado = 0;
		resultado = num1 + num2;
		return resultado;		
	}
}
