package practicaJava;

public class ConSaldo extends BaseTransferencia  implements InterfaceCajero {

	@Override
	public int tramite(int Dinero,int idPersona) {
		int mio=this.obtenerSaldo(idPersona);
		return mio;
	}

}
