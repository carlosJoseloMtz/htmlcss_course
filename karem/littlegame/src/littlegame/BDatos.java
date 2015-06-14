package littlegame;

public class BDatos {
	public mascota obtenerNombre(int id)
	{
      mascota mascota=new mascota();
	
	mascota.setId(id);
	if(id==1)	{
		mascota.setNombre("dinosaurio");
	}
	if(id==2)	{
	    mascota.setNombre("perro");
	}
	if(id==3)	{
		mascota.setNombre("pez");
		}
		return mascota;
	}
	public mascota inicializarMascota(int id)
	{
	mascota mascota=new mascota();
	
	mascota.setId(id);
	if(id!=0)	{
		mascota.setEntretenimiento(100);
		mascota.setHambre(100);
		mascota.setLimpio(100);
	}
	
	return mascota;
	}
}
