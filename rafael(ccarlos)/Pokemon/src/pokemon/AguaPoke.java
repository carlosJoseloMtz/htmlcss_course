package pokemon;

public class AguaPoke implements InterfacePoke {

	@Override
	public void pelear(Pokemon pokemon) {
		System.out.println("atacando con agua");
	}
	
	@Override
	public void curar(Pokemon pokemon) {
		System.out.println("curando pokemon de agua " + pokemon.getNombre());		
	}
	
	@Override
	public void evolucionar(Pokemon pokemon) {
		
		System.out.println("ya no evoluciona");
	}

}
