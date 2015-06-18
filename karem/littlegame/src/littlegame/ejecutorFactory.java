package littlegame;

public class ejecutorFactory {
public static void main(String[]arg){
	mascota mascota=new mascota();
	mascota.setAburrido(50);
	mascota.setSucio(75);
	mascota.setHambriento(50);
	//dinosaurio
	mascota.setColor("verde");
	mascota.setEspecie("dinosaurio");
	mascota.setId(1);
	mascota.setNombre("dino");
	
	// perro
	//mascota.setColor("naranja");
	//mascota.setEspecie("perro");
	//mascota.setId(2);
	//mascota.setNombre("firulais");
	
	//pez
//	mascota.setColor("azul");
//	mascota.setEspecie("pez");
//	mascota.setId(3);
//	mascota.setNombre("flopy");
	
	interfaceTamagotchiFactory intfac=new interfaceTamagotchiFactory();
	System.out.println("tu mascota es un "+mascota.getEspecie() +" de color "+mascota.getColor()+" y se llama "+ mascota.getNombre());
	interfaceTamagotchi interactua=intfac.interactuar(mascota);
	System.out.println("tu nivel de hambre es "+mascota.getHambriento()+" tu nivel de limpieza es "+mascota.getSucio()+" y tu nivel de juego es "+mascota.getAburrido());
	
	//alimentar
	interactua.alimentarr(mascota);
	System.out.println("bajaron tus niveles de juego a "+mascota.getAburrido()+" y de limpieza a "+mascota.getSucio());
	
	//jugar
//	interactua.jugar(mascota);
//	System.out.println("bajaron tus niveles de hambre a "+mascota.getHambriento()+" y de limpieza a "+mascota.getSucio());

	
	//limpiar
//	interactua.limpiar(mascota);
//	System.out.println("bajaron tus niveles de juego a "+mascota.getAburrido()+" y de hambre a "+mascota.getHambriento());
}
}