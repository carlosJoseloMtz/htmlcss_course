
public class DoparPoke extends BaseTransferencia implements InterfacePoke {

	@Override
	public int Pokemon(int IdPoke) {
		int ataque=this.obtenerAtaque(IdPoke);			
		return ataque;	
	}
}
