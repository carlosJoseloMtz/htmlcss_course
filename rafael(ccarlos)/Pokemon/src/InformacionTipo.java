
public class InformacionTipo extends BaseTransferencia  implements InterfacePoke{

	@Override
	public int Pokemon (int IdPoke) {
		String tipo1=this.obtenerTipo(IdPoke);
		int tipo=Integer.parseInt(tipo1);
		return tipo;
	}
}
