package practicaJava;

public class deposito extends BaseTransferencia implements InterfaceCajero{

	@Override
	public int tramite(int Dinero,int idPersona) {
		int mio= this.obtenerSaldo(idPersona);
		int depositar=mio+Dinero;
		return depositar;
	}

}
