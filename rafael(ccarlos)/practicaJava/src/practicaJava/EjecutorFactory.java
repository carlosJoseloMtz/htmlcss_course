package practicaJava;

public class EjecutorFactory {
	public static void main(String[]argument){
		InterfaceCajeroFactory cajeroFactory = new InterfaceCajeroFactory();
		
		InterfaceCajero cajero= cajeroFactory.Tramite("Deposito");
		int Completado=cajero.tramite(200,4);
		System.out.println(Completado);
	}

}
