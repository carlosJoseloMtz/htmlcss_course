	
	public class BaseTransferencia {
		
		public String obtenerNombre(int idPoke){
		AccesoBDatos acceso= new AccesoBDatos();
		Pokemon pokemon=acceso.obtenerNombre(idPoke);
		String nombre=pokemon.getNombre();
		return nombre;
		}
		
		public int obtenerSalud(int idPoke){
			AccesoBDatos acceso= new AccesoBDatos();
			Pokemon pokemon=acceso.obtenerSalud(idPoke);
			int salud=pokemon.getSalud();
			return salud;
			}
		
		public int obtenerAtaque(int idPoke){
			AccesoBDatos acceso= new AccesoBDatos();
			Pokemon pokemon=acceso.obtenerAtaque(idPoke);
			int ataque=pokemon.getAtaque();
			return ataque;
			}
		
		public String obtenerTipo(int idPoke){
			AccesoBDatos acceso= new AccesoBDatos();
			Pokemon pokemon=acceso.obtenerTipo(idPoke);
			String tipo=pokemon.getTipo();
			return tipo;
			}
		
		
		
	}



