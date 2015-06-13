
public class EjecutorFactory {


	public static void main(String[]argument){
		InterfacePokemonFactory PokemonFactory = new InterfacePokemonFactory();
		int id=1;
		InterfacePoke pokemon1= PokemonFactory.Opcion("Nombre");
		InterfacePoke pokemon2= PokemonFactory.Opcion("Tipo");
		InterfacePoke pokemon3= PokemonFactory.Opcion("Ataque");
		InterfacePoke pokemon4= PokemonFactory.Opcion("Vida");
		int nombre=pokemon1.Pokemon(id);		
		int tipo=pokemon2.Pokemon(id);
		int ataque=pokemon3.Pokemon(id);
		int vida=pokemon4.Pokemon(id);
		System.out.println("Elegiste a "+nombre + " de tipo "+tipo+" con ataque de "+ataque+" y una vida de"+ vida );
		

	}
}
