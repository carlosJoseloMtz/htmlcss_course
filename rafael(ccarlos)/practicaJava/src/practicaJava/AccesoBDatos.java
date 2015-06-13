package practicaJava;

public class AccesoBDatos {
	

	public Persona obtenerPersona(int id)
	{
	Persona persona=new Persona();
	
	persona.setId(id);
	if(id==1)	{
		persona.setSaldo(1000);
	}
	if(id==2)	{
		persona.setSaldo(100);
	}
	if(id==3)	{
		persona.setSaldo(2000);
	}
	if(id==4)	{
		persona.setSaldo(10000000);
	}
	return persona;
	}
}
