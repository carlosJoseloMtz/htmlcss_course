
public class InformacionNombre extends BaseTransferencia  implements InterfacePoke{

	@Override
	public int Pokemon (int IdPoke) {
		int nombre1=Integer.parseInt(this.obtenerNombre(IdPoke));
		return nombre1;
	}
}