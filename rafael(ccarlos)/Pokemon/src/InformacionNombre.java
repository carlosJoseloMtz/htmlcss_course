
public class InformacionNombre extends BaseTransferencia  implements InterfacePoke{

	@Override
	public String Pokemon (int IdPoke) {
		String nombre=this.obtenerNombre(IdPoke);
		return nombre;
	}
}