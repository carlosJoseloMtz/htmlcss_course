package littlegame;

public class perro implements interfaceTamagotchi {

	
	
	@Override
	public void jugar(mascota mascota) {
		// TODO Auto-generated method stub
		System.out.println("firulais esta jugando con una  pelota");
		mascota.setAburrido(mascota.getAburrido()+25);
		System.out.println();
	}

	@Override
	public void alimentarr(mascota mascota) {
		// TODO Auto-generated method stub
		System.out.println("firulais esta comiendo dog chow :)");
		
	}

	@Override
	public void limpiar(mascota mascota) {
		// TODO Auto-generated method stub
		System.out.println("el espacio de firulais esta limpio");
		
	}
}