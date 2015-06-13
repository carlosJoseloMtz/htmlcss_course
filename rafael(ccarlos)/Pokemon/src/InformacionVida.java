
public class InformacionVida  extends BaseTransferencia  implements InterfacePoke {

	@Override
	public int Pokemon(int IdPoke) {
		int salud=this.obtenerSalud(IdPoke);
		return salud;
	}

}
