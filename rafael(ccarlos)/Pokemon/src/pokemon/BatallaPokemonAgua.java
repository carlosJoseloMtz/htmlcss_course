package pokemon;

public class BatallaPokemonAgua implements InterfaceBatallaPokemon {

	@Override
	public Pokemon pelear(Pokemon op1, Pokemon op2) {

		Pokemon ganador = null;
		
		if (op1.getNivelAtaque() > op2.getNivelAtaque()) {
			ganador = op1;
		} else {
			ganador = op2;
		}
		
		Pokemon pokemon = new Pokemon();
		
//		pokemon.setEdad(interfacePokemonFactory.Opcion("edad"));
//		pokemon.setNombre(interfacePokemonFactory.Opcion("nombre"));
		
		
		// InterfaceTamagochi - jugar, alimentar, arruyar
		// DinosaurioTamagochi - jugar()
		// PezTamagochi - jugar()
		
		// Personaje - nombre, tipo de personaje, edad
		
		// TamagochiFactory - interactuar(Personaje personaje, "jugar")
		
		
		System.out.println("pokemon " + pokemon.getNivelAtaque());
		
		
		return ganador;
	}

}
