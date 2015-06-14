public class CurarPoke extends BaseTransferencia  implements InterfacePoke{

	@Override
	public String Pokemon (int IdPoke) {
		String salud=Integer.toString(this.obtenerSalud(IdPoke));
		if(this.obtenerSalud(IdPoke)<=100)
		{
			salud=Integer.toString(100);		
		}
		return salud;
		
		
	}

}
