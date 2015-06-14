package practicaJava;

public class transBanc extends BaseTransferencia implements InterfaceCajero {

	@Override
	public int tramite(int Dinero,int idPersona) {
		int mio=this.obtenerSaldo(idPersona);
		int transferencia=mio-Dinero;
		return transferencia;
	}
	

}
