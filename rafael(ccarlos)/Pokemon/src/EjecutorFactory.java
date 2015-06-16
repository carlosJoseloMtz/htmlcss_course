
public class EjecutorFactory {


	public static void main(String[]argument){
	Pokemon pokemon=new Pokemon();	
	pokemon.setSalud(80);
	pokemon.setAtaque(1);
	pokemon.setNivel(1);
	pokemon.setTipo("agua");
	pokemon.setNombre("sqare");
	pokemon.setId(1);
	
	InterfacePokemonFactory factory = new InterfacePokemonFactory();
	System.out.println("Escogiste a  "+pokemon.getNombre()+" con salud "+pokemon.getSalud()+" con ataque de "+pokemon.getAtaque()+" de nivel "+pokemon.getNivel());
	InterfacePoke algo=factory.Opcion(pokemon);
	algo.ataque(pokemon);

	}
}
