public class InterfacePokemonFactory{
	
	public InterfacePoke Opcion(Pokemon pokemon){
	InterfacePoke ntipo = null;
	if (pokemon.getTipo().equals("agua")){
		ntipo= new TipoAgua();		
	}	
	if (pokemon.getTipo().equals("fuego")){
		ntipo= new TipoFuego();
	}	
	if (pokemon.getTipo().equals("hierba")){
		ntipo= new TipoHierba();
	}	
	if (pokemon.getTipo().equals("electrico")){
		ntipo= new TipoElectrico();
	}	
	return ntipo ;
}	
}
