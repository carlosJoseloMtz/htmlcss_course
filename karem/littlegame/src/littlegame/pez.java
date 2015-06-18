package littlegame;

public class pez implements interfaceTamagotchi{

	@Override
	public void jugar(mascota mascota) {
		// TODO Auto-generated method stub
		
		if(mascota.getAburrido()>=100){
			System.out.println("flopy ya no quiere jugar");
			mascota.setHambriento(mascota.getHambriento()-25);
			mascota.setSucio(mascota.getSucio()-25);
		}
		else{
			System.out.println("flopy esta aburrido su nivel de juego es de "+mascota.getAburrido()+" juega para aumentar su nivel");
			System.out.println("flopy hace burbujas alrededor de un coral");
			System.out.println("glu glu glu");
			mascota.setAburrido(mascota.getAburrido()+25);
			System.out.println("flopy ahora tiene "+mascota.getAburrido()+" puntos de juego");
			mascota.setHambriento(mascota.getHambriento()-25);
			mascota.setSucio(mascota.getSucio()-25);
	}
	}

	@Override
	public void alimentarr(mascota mascota) {
		// TODO Auto-generated method stub
		
		if(mascota.getHambriento()>=100){
			System.out.println("flopy esta satisfecho");
			mascota.setAburrido(mascota.getAburrido()-25);
			mascota.setSucio(mascota.getSucio()-25);
		}
		else{
			System.out.println("flopy tiene hambre su nivel de hambre es de "+mascota.getHambriento()+" alimentalo para aumentar su nivel");
			System.out.println("flopy se comió unas hojuelas de alimento ");
			System.out.println("yummi yummi");
			mascota.setHambriento(mascota.getHambriento()+25);
			System.out.println("flopy ahora tiene "+mascota.getHambriento()+" puntos de hambre");
			mascota.setAburrido(mascota.getAburrido()-25);
			mascota.setSucio(mascota.getSucio()-25);
	}
	}

	@Override
	public void limpiar(mascota mascota) {
		// TODO Auto-generated method stub
		
		if(mascota.getSucio()>=100){
			System.out.println("flopy esta limpio");
			mascota.setHambriento(mascota.getHambriento()-25);
			mascota.setAburrido(mascota.getAburrido()-25);
		}
		else{
			System.out.println("flopy esta sucio!! su nivel de limpieza es de "+mascota.getSucio()+" limpialo para aumentar su nivel");
			System.out.println("la pecera de flopy ahora esta limpia");
			mascota.setSucio(mascota.getSucio()+25);
			System.out.println("flopy ahora tiene "+mascota.getSucio()+" puntos de limpieza");
			mascota.setHambriento(mascota.getHambriento()-25);
			mascota.setAburrido(mascota.getAburrido()-25);
		}
		
	}

}
