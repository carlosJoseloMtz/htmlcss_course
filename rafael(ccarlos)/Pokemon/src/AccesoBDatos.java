
public class AccesoBDatos {
	
	

	public Pokemon obtenerSalud(int id)
	{
	Pokemon pokemon=new Pokemon();
	
	pokemon.setId(id);
	if(id==1)	{
		pokemon.setSalud(50);
	}
	if(id==2)	{
		pokemon.setSalud(200);
	}
	if(id==3)	{
		pokemon.setSalud(300);
	}
	if(id==4)	{
		pokemon.setSalud(10000000);
	}
	return pokemon;
	}
	
	public Pokemon obtenerAtaque(int id)
	{
	Pokemon pokemon=new Pokemon();
	
	pokemon.setId(id);
	if(id==1)	{
		pokemon.setAtaque(100);
	}
	if(id==2)	{
		pokemon.setAtaque(200);
	}
	if(id==3)	{
		pokemon.setAtaque(300);
	}
	if(id==4)	{
		pokemon.setAtaque(10000000);
	}
	return pokemon;
	}
	
	public Pokemon obtenerNombre(int id)
	{
	Pokemon pokemon=new Pokemon();
	
	pokemon.setId(id);
	if(id==1)	{
		pokemon.setNombre("Charmander");
	}
	if(id==2)	{
		pokemon.setNombre("Vulbasour");
	}
	if(id==3)	{
		pokemon.setNombre("Square");
	}
	if(id==4)	{
		pokemon.setNombre("Pikachu");
	}
	return pokemon;
	}

	public Pokemon obtenerTipo(int id)
	{
	Pokemon pokemon=new Pokemon();
	
	pokemon.setId(id);
	if(id==1)	{
		pokemon.setTipo("Fuego");
	}
	if(id==2)	{
		pokemon.setTipo("Hierva");
	}
	if(id==3)	{
		pokemon.setTipo("Agua");
	}
	if(id==4)	{
		pokemon.setTipo("Electrico");
	}
	return pokemon;
	}
}

	

