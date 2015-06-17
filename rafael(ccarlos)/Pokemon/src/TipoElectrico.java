
public class TipoElectrico implements InterfacePoke{

	@Override
	public void curarPokemon(Pokemon pokemon) {
		System.out.println("tu vida actual es "+pokemon.getSalud());
		int nuevasalud=100;
		pokemon.setSalud(nuevasalud);
		System.out.println("tu pokemon re-establecio su vida a"+pokemon.getSalud());
					
	}

	@Override
	public void evolucionarPokemon(Pokemon pokemon) {
		System.out.println("Pikachu no puede evolucionar hasta que consigas la piedra trueno");		
	}

	@Override
	public void aumentosPokemon(Pokemon pokemon) {
		System.out.println("Tu ataque del pokemon  es "+pokemon.getAtaque());

		pokemon.setAtaque(pokemon.getAtaque()+1);	
		System.out.println("Tu salud del pokemon  es "+ pokemon.getSalud());	

		pokemon.setSalud(pokemon.getSalud()+1);	
		System.out.println("Tu nivel del pokemon  es "+pokemon.getNivel());
		pokemon.setNivel(pokemon.getNivel()+1);	
		System.out.println("Tu ataque subio a "+pokemon.getAtaque());
		System.out.println("Tu ataque subio a "+pokemon.getSalud());
		System.out.println("Tu ataque subio a "+pokemon.getNivel());
		
	}

	@Override
	public void ataque(Pokemon pokemon) {
		int vidaenemigo=100;
		int ataquenemigo=50;
		int turno=1;
		boolean adios=true;
		while(adios)
		{
		if(turno==1&&vidaenemigo==100){			
		System.out.println("te encontraste a un pokemon, te quiere atacar ¡rompele su madre!");
		System.out.println("tu  vida es de "+pokemon.getSalud()+" y la de tu enemigo " +vidaenemigo);
		System.out.println("atacaste con atacktrueno, hiciste " +pokemon.getAtaque()+" de daño");
		vidaenemigo=vidaenemigo-pokemon.getAtaque();
		System.out.println("la vida de tu enemigo bajo a "+ vidaenemigo);
		turno=2;
		}
		if(turno==2&&vidaenemigo>0)
		{

			System.out.println("turno de tu enemigo");
		System.out.println("El pokemon te hizo un daño de "+ ataquenemigo);
		pokemon.setSalud(pokemon.getSalud()-ataquenemigo);
		System.out.println("tu vida bajo a "+pokemon.getSalud());
		turno=1;

		if(pokemon.getSalud()<=0){
			System.out.println("Perdiste la batalla Pokemon :( ");		
			adios=false;
		}

		}
		if(turno==1&&pokemon.getSalud()>0){

			System.out.println("tu turno");
			System.out.println("atacaste con atacktrueno, hiciste " +pokemon.getAtaque()+" de daño");
			vidaenemigo=vidaenemigo-pokemon.getAtaque();
			System.out.println("la vida de tu enemigo bajo a "+ vidaenemigo);
			turno=2;

			if(vidaenemigo<=0 ){
				System.out.println("Ganaste la batalla Pokemon  !!");	
				adios=false;
			}
		}
	}
		
	}
	


}
