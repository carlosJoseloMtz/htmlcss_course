package pokemon;

public class EjecutorPokemon {

	public static void main(String[] ar) {
		Pokemon pikachu = new Pokemon();
		pikachu.setEdad(3);
		pikachu.setNivelAtaque(1);
		pikachu.setNombre("ramon");
		pikachu.setTipoDePokemon("fuego");
		
		PokemonFactory factory = new PokemonFactory();
		
		InterfacePoke interactor = factory.interactuar(pikachu);
		
		interactor.curar(pikachu);
		
	}
}
