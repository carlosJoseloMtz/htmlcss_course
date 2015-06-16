
public class TipoElectrico implements InterfacePoke{

	@Override
	public void curarPokemon(Pokemon pokemon) {
		System.out.println("tu vida actual es "+pokemon.getSalud());
		int nuevasalud=100;
		pokemon.setSalud(nuevasalud);
		System.out.println("tu pokemon re-establecio su vida a"+pokemon.getSalud());
					
	}

	@Override
	public void evolucionarPokemon(Pokemon pokemon1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aumentosPokemon(Pokemon pokemon1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ataque(Pokemon pokemon) {
		// TODO Auto-generated method stub
		
	}
	


}
