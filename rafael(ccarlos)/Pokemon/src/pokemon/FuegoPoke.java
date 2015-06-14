package pokemon;

public class FuegoPoke implements InterfacePoke {

	@Override
	public void pelear(Pokemon pokemon) {
		System.out.println("atacando con fuego");
	}
	
	@Override
	public void curar(Pokemon pokemon) {
		int nivelActual = pokemon.getNivelAtaque();
		pokemon.setNivelAtaque(nivelActual + 5);
		System.out.println("curando pokemon de fuego " + pokemon.getNombre());		
	}
	
	@Override
	public void evolucionar(Pokemon pokemon) {
		
		System.out.println("para evolucionar este pokemon requiere mas batallas");
	}
}
