package littlegame;

public class dinosaurio implements interfaceTamagotchi {

	@Override
	public void jugar(mascota mascota) {
		// TODO Auto-generated method stub
		
		if(mascota.getAburrido()>=100){
			System.out.println("dino ya no quiere jugar");
			mascota.setHambriento(mascota.getHambriento()-25);
			mascota.setSucio(mascota.getSucio()-25);
		}
		else{
			System.out.println("dino esta aburrido su nivel de juego es de "+mascota.getAburrido()+" juega para aumentar su nivel");
		System.out.println("dino esta pintando huevos de terodactilo ");
		System.out.println("...");
			mascota.setAburrido(mascota.getAburrido()+25);
		System.out.println("dino ahora tiene "+mascota.getAburrido()+" puntos de juego");
		mascota.setHambriento(mascota.getHambriento()-25);
		mascota.setSucio(mascota.getSucio()-25);
	}
			
		}
		

	@Override
	public void alimentarr(mascota mascota) {
		// TODO Auto-generated method stub
		
		if(mascota.getHambriento()>=100){
			System.out.println("dino esta satisfecho");
			mascota.setAburrido(mascota.getAburrido()-25);
			mascota.setSucio(mascota.getSucio()-25);
		}
		else{
			System.out.println("dino tiene hambre su nivel de hambre es de "+mascota.getHambriento()+" alimentalo para aumentar su nivel");
			System.out.println("dino se comió a tu mamá :( ");
			System.out.println("ñam ñam ñam");
			mascota.setHambriento(mascota.getHambriento()+25);
			System.out.println("dino ahora tiene "+mascota.getHambriento()+" puntos de hambre");
			mascota.setAburrido(mascota.getAburrido()-25);
			mascota.setSucio(mascota.getSucio()-25);
		}
	}

	@Override
	public void limpiar(mascota mascota) {
		// TODO Auto-generated method stub
		if(mascota.getSucio()>=100){
			System.out.println("dino esta limpio");
			mascota.setHambriento(mascota.getHambriento()-25);
			mascota.setAburrido(mascota.getAburrido()-25);
		}
		else{
			System.out.println("dino esta sucio!! su nivel de limpieza es de "+mascota.getSucio()+" limpialo para aumentar su nivel");
			System.out.println("dino se baña mientras barres su cuevita :) ");
			mascota.setSucio(mascota.getSucio()+25);
			System.out.println("dino ahora tiene "+mascota.getSucio()+" puntos de limpieza");
			mascota.setHambriento(mascota.getHambriento()-25);
			mascota.setAburrido(mascota.getAburrido()-25);
		}
		
	}

}
