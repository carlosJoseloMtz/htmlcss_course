
public class InformacionVida  extends BaseTransferencia  implements InterfacePoke {

	@Override
	public String Pokemon(int IdPoke) {
		String salud=Integer.toString(this.obtenerSalud(IdPoke));
		return salud;
	}

}
