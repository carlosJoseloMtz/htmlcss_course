package littlegame;

public class perro implements interfaceTamagotchi {

	
	
	@Override
	public void jugar(mascota mascota) {
		// TODO Auto-generated method stub
		
		if(mascota.getAburrido()>=100){
			System.out.println("firulais ya no quiere jugar");
			mascota.setHambriento(mascota.getHambriento()-25);
			mascota.setSucio(mascota.getSucio()-25);
		}
		else{
			System.out.println("firulais esta aburrido su nivel de juego es de "+mascota.getAburrido()+" juega para aumentar su nivel");
			System.out.println("firulais va por la varita");
			System.out.println("wof <3 wof <3");
			mascota.setAburrido(mascota.getAburrido()+25);
			System.out.println("firulais ahora tiene "+mascota.getAburrido()+" puntos de juego");
			mascota.setHambriento(mascota.getHambriento()-25);
			mascota.setSucio(mascota.getSucio()-25);
	}
			
		}


	@Override
	public void alimentarr(mascota mascota) {
		// TODO Auto-generated method stub
		if(mascota.getHambriento()>=100){
			System.out.println("firulais esta satisfecho");
			mascota.setAburrido(mascota.getAburrido()-25);
			mascota.setSucio(mascota.getSucio()-25);
		}
		else{
			System.out.println("firulais tiene hambre su nivel de hambre es de "+mascota.getHambriento()+" alimentalo para aumentar su nivel");
			System.out.println("firulais esta comiendo dog chow :) ");
			mascota.setHambriento(mascota.getHambriento()+25);
			System.out.println("firulais ahora tiene "+mascota.getHambriento()+" puntos de hambre");
			mascota.setAburrido(mascota.getAburrido()-25);
			mascota.setSucio(mascota.getSucio()-25);
	}
	}

	@Override
	public void limpiar(mascota mascota) {
		// TODO Auto-generated method stub
		if(mascota.getSucio()>=100){
			System.out.println("firulais esta limpio y huele bien");
			mascota.setHambriento(mascota.getHambriento()-25);
			mascota.setAburrido(mascota.getAburrido()-25);
		}
		else{
			System.out.println("firulais esta sucio y huele mal.. fuchii!! su nivel de limpieza es de "+mascota.getSucio()+" limpialo para aumentar su nivel");
			System.out.println("el espacio de firulais esta limpio y el tambien :) ");
			mascota.setSucio(mascota.getSucio()+25);
			System.out.println("firulais ahora tiene "+mascota.getSucio()+" puntos de limpieza");
			mascota.setHambriento(mascota.getHambriento()-25);
			mascota.setAburrido(mascota.getAburrido()-25);
	}
	}
}