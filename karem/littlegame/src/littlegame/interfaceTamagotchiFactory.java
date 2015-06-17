package littlegame;

public class interfaceTamagotchiFactory {
public interfaceTamagotchi interactuar(mascota mascota) {
		
		interfaceTamagotchi Mascota = null;
		
		if (mascota.getEspecie().equals("dinosaurio")) {
			Mascota = new dinosaurio();
		}
		
		if (mascota.getEspecie().equals("perro")) {
			Mascota = new perro();
		}
		if (mascota.getEspecie().equals("pez")) {
			Mascota = new pez();
		}
		
		return Mascota;
	}
	
}


