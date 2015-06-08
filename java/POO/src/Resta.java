
public class Resta implements OperacionAritmetica {

	@Override
	public int ejecutarOperacion(int num1, int num2) {
		int resultado = num1 - num2;
		return resultado;
	}

}
