package practicaJava;

public class BaseTransferencia {
	
	public int obtenerSaldo(int idPersona){
	AccesoBDatos acceso= new AccesoBDatos();
	Persona persona=acceso.obtenerPersona(idPersona);
	int saldo=persona.getSaldo();
	return saldo;
	}

}
