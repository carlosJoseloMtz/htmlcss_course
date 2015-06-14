package pokemon;

public class PokemonFactory {

	public InterfacePoke interactuar(Pokemon pokemon) {
		
		InterfacePoke iPoke = null;
		
		if (pokemon.getTipoDePokemon().equals("agua")) {
			iPoke = new AguaPoke();
		}
		
		if (pokemon.getTipoDePokemon().equals("fuego")) {
			iPoke = new FuegoPoke();
		}
		
		return iPoke;
	}
	
}
