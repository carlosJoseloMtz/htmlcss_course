
public class InformacionUsuario {

	public int obtenerSaldo(int idPersona) {
		AccesoBDPersona acceso = new AccesoBDPersona();
		Persona persona = null;
		try {
			persona = acceso.obtenerPersona(idPersona);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int saldo = persona.getSaldo();		
		return saldo;
	}
	
}
