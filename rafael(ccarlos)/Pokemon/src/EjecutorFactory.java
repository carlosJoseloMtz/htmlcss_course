
public class EjecutorFactory {


	public static void main(String[]argument){
		InterfacePokemonFactory PokemonFactory = new InterfacePokemonFactory();
		int id=2;
		InterfacePoke pokemon1= PokemonFactory.Opcion("Nombre");
		InterfacePoke pokemon2= PokemonFactory.Opcion("Tipo");
		InterfacePoke pokemon3= PokemonFactory.Opcion("Ataque");
		InterfacePoke pokemon4= PokemonFactory.Opcion("Vida");
		String nombre=pokemon1.Pokemon(id);
		String tipo=pokemon2.Pokemon(id);
		String ataque=pokemon3.Pokemon(id);
		String vida=pokemon4.Pokemon(id);
		System.out.println("Elegiste a "+nombre+" es de tipo "+tipo+" con ataque de "+ataque+" y una vida de "+ vida );
		

		InterfacePoke pokemon= PokemonFactory.Opcion("Dopar");
		String dopar=pokemon.Pokemon(id);		
		System.out.println("El ataque de tu pokemon subio a "+dopar);
		

	}
}
