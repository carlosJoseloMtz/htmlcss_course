
public class TipoHierba implements InterfacePoke {


	@Override
	public void curarPokemon(Pokemon pokemon) {
		System.out.println("tu vida actual es "+pokemon.getSalud());
		int nuevasalud=100;
		pokemon.setSalud(nuevasalud);
		System.out.println("tu pokemon re-establecio su vida a"+pokemon.getSalud());
					
	}

	@Override
	public void evolucionarPokemon(Pokemon pokemon) {

		System.out.println("Tu nivel actual es " + pokemon.getNivel() +" necesitas subir mas");
		if(pokemon.getNivel()==1)
		{
		System.out.println("Tu pokemon esta a punto de subir");
		}
		if(pokemon.getNivel()==2){
		pokemon.setNombre("Ibasor");
		System.out.println("Tu pokemon evolciono ahora se llama " + pokemon.getNombre());
		}
		if(pokemon.getNivel()==3){
			pokemon.setNombre("Venasur");
			System.out.println("Tu pokemon alcanzo la maxima evolcion ahora se llama " + pokemon.getNombre());
		}		
		
	}

	@Override
	public void aumentosPokemon(Pokemon pokemon) {
		System.out.println("Tu ataque del pokemon es "+pokemon.getAtaque());

		pokemon.setAtaque(pokemon.getAtaque()+1);	
		System.out.println("Tu salud del pokemon es "+ pokemon.getSalud());	

		pokemon.setSalud(pokemon.getSalud()+1);	
		System.out.println("Tu nivel del pokemon es "+pokemon.getNivel());
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
			System.out.println("te encontraste a un pokemon, te quiere atacar �rompele su madre!");
			System.out.println("tu  vida es de "+pokemon.getSalud()+" y la de tu enemigo " +vidaenemigo);
			System.out.println("atacaste con hojas navaja, hiciste " +pokemon.getAtaque()+" de da�o");
			vidaenemigo=vidaenemigo-pokemon.getAtaque();
			System.out.println("la vida de tu enemigo bajo a "+ vidaenemigo);
			turno=2;
			}
			if(turno==2&&vidaenemigo>0)
			{

				System.out.println("turno de tu enemigo");
			System.out.println("El pokemon te hizo un da�o de "+ ataquenemigo);
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
				System.out.println("atacaste con  hojas navaja, hiciste " +pokemon.getAtaque()+" de da�o");
				vidaenemigo=vidaenemigo-pokemon.getAtaque();
				System.out.println("la vida de tu enemigo bajo a "+ vidaenemigo);
				turno=2;

				if(vidaenemigo<=0 ){
					System.out.println("Ganaste la batalla Pokemon  !! ");	
					adios=false;
				}
			}
		}
		
	}
	

	

}
