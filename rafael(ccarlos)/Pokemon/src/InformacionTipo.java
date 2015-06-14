
public class InformacionTipo extends BaseTransferencia  implements InterfacePoke{

	@Override
	public String Pokemon (int IdPoke) {
		String tipo=this.obtenerTipo(IdPoke);
		return tipo;
	}
}
