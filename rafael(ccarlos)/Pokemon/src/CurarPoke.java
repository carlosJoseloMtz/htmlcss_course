public class CurarPoke extends BaseTransferencia  implements InterfacePoke{

	@Override
	public int Pokemon (int IdPoke) {
		int salud=this.obtenerSalud(IdPoke);
		if(this.obtenerSalud(IdPoke)<=100)
		{
			salud=100;		
		}
		return salud;
		
		
	}

}
