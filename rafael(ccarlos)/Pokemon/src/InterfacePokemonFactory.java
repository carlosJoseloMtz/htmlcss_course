


public class InterfacePokemonFactory {

	public InterfacePoke Opcion(String tipoOpcion){
		InterfacePoke pokemon=null;
		
		if(tipoOpcion.equals("Pelear")){
			pokemon= new PeleaPoke();
		}
		if(tipoOpcion.equals("Curar")){
			pokemon= new CurarPoke();
		}
		if(tipoOpcion.equals("Dopar")){
			pokemon= new DoparPoke();
		}
		if(tipoOpcion.equals("Vida")){
			pokemon= new InformacionVida();
		}
		if(tipoOpcion.equals("Tipo")){
			pokemon= new InformacionTipo();
		}
		if(tipoOpcion.equals("Nombre")){
			pokemon= new InformacionNombre();
		}
		if(tipoOpcion.equals("Ataque")){
			pokemon= new InformacionAtaque();
		}
		
		
		
		
		return pokemon;
		
	}
	
}
