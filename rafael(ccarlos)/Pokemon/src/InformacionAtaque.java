
public class InformacionAtaque  extends BaseTransferencia  implements InterfacePoke {

	@Override
	public String Pokemon(int IdPoke) {
		String ataque=Integer.toString(this.obtenerAtaque(IdPoke));
		return ataque;
	}

}
