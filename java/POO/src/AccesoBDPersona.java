import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;


public class AccesoBDPersona {

	/**
	 * Esta es una constante en la que voy a guardar la ruta en la que está el archivo,
	 * es indispensable que pongan una ruta de su máquina -en donde quieren que se guarde-
	 * 
	 *  la variable es privada porque sólo esta clase debería verla, no tiene caso que otras la vean...
	 *  es final porque es una constante, nadie puede cambiarle el valor cuando la usen en los métodos
	 *		vamos a entender -ahorita- como estático todo aquello que no requiere poner "new" o... igual a,
	 *		es decir, todo aquello que no necesita instanciarse/inicializarse para cada vez que se use...
	 */
	private static final String DIRECCION_DEL_ARCHIVO_DE_NUESTRA_BD = "/home/carlos/Documentos/personas/personas.bd";

	public Persona obtenerPersona(int id) throws Exception {
		
		// se que necesito retornar una persona
		// pero aún no sé si existe en la base de datos
		// así que la inializo en nulo
	    Persona personaBuscada = null;


		// saco todas las personas del archivo
		List<Persona> personas = getTodasLasPersonas();
		
		// voy iterando entre cada persona de las que existen
	    for (Persona cadaPersona : personas) {
	    	
	    	// si encuentro la persona que busco
	    	if (cadaPersona.getId() == id) {
	    		// guardo esa persona en mi variable para retornar
	    		personaBuscada = cadaPersona;
	    		// termino el ciclo porque ya la encontré
	    		// y por ende, no tiene caso seguir buscando
	    		break;
	    	}
	    }
	    
	    // regreso la persona, recuerden que si no la encontré va a ser nulo...
		return personaBuscada;
	}
	

	public void crearPersona(Persona persona) throws Exception {
		File archivoBD = new File(DIRECCION_DEL_ARCHIVO_DE_NUESTRA_BD);
		/**
		 * 
		 * Originalmente, tendríamos que implementar el código de nuestra propia lista pero eso sería mucho,
		 * O agregar una librería, o más cosas, pero vamos a mentenerlo lo más independiente posible,
		 * 
		 * Dado que no se pueden agregar elementos de tipo persona y más tarde
		 * interpretarlos como lista de personas... Vamos a tener que hacer un truco aquí,
		 * 
		 * Tomaremos como que siempre guardamos una lista de personas... y siempre que lo leamos nos traerá
		 * a todas las personas como una lista... pero para esto va lo siguiente:
		 */
		
		
		// si el archivo no existe... crea uno para poder utilizarlo más tarde
		if (archivoBD.exists() == false) {
			// inicializamos el archivo fingiendo que existe y tiene un objeto de tipo lista de personas aunque
			// no tenga nada...
			List<Persona> listaVacia = new ArrayList<Persona>();
			// esta lista tiene una visualización para el if, no puedo usarla afuera, y no debería
			// porque se vería obvio que estoy haciendo trampa :B
			
			writeToFile(archivoBD, listaVacia);
		}
		
		
		// suponiendo que el archivo ya existe...
		
		// saco todas las personas que ya hay en el archivo
		List<Persona> personasExistentes = getTodasLasPersonas();
		
		
		// checamos que la persona no exista ya (en base al id)
		// porque si ya existe no debemos agregarlo nuevamente
		boolean laPersonaYaExisteEnElArchivo = false;
		for (Persona cadaPersona : personasExistentes) {
			if (cadaPersona.getId() == persona.getId()) {
				laPersonaYaExisteEnElArchivo = true;
			}	
		}
		
		// si la persona no está en el archivo, quiere decir que es nueva, así que lo agregamos
		if (laPersonaYaExisteEnElArchivo == false) {
			// agrego la nueva persona a esa lista
			personasExistentes.add(persona);
		} else {
			// si ya existia en el archivo, manda un mensaje que diga que ya existia
			System.out.println("esta persona ya existe en la base de datos");
			System.out.println("no se guardara nuevamente");
			System.out.println("si deseas editarla porfavor seleccione actualizar persona");
			System.out.println("==============================================");
		}
		
		
		// sobreescribo el archivo con la nueva lista
		writeToFile(archivoBD, personasExistentes);
		
		
	}
	
	public void actualizarPersona(Persona persona) throws Exception {


		// saco todas las personas del archivo
		List<Persona> personas = getTodasLasPersonas();
		
		// voy iterando entre cada persona de las que existen
	    for (Persona cadaPersona : personas) {
	    	
	    	// si encuentro la persona que busco
	    	if (cadaPersona.getId() == persona.getId()) {
	    		
	    		// actualizo todos los datos de esta persona en la lista
	    		cadaPersona.setFoto(persona.getFoto());
	    		cadaPersona.setNombre(persona.getNombre());
	    		cadaPersona.setSaldo(persona.getSaldo());
	    		
	    		// termino el ciclo porque ya actualicé a la persona que buscaba
	    		break;
	    	}
	    }
	    

		File archivoBD = new File(DIRECCION_DEL_ARCHIVO_DE_NUESTRA_BD);
		
		// vuelvo a escribir el archivo con la persona actualizada
	    writeToFile(archivoBD, personas);
	}
	

	
	
	
	
	/**
	 * Este método es privado porque sólo esta clase puede verlo ya que
	 * hace un trabajo muy específico para acceder a un archivo
	 */
	private List<Persona> getTodasLasPersonas() throws Exception {
		// voy a buscar el archivo
		
		InputStream file = new FileInputStream(DIRECCION_DEL_ARCHIVO_DE_NUESTRA_BD);
	    InputStream buffer = new BufferedInputStream(file);
	    ObjectInput input = new ObjectInputStream(buffer);
	    
	    // casteo/parseo/convierto el objeto que regresa el método readObject en el objeto que quiero
	    List<Persona> personas = (List<Persona>) input.readObject();
	    
	    // cierro todos los streams al archivo para que no se quede ningún flujo por ahí...
	    input.close();
	    buffer.close();
	    file.close();
	    return personas;
	}
	

	/**
	 * Este método es privado porque sólo esta clase puede verlo ya que
	 * hace un trabajo muy específico para acceder a un archivo
	 */
	private void writeToFile(File actualFile, List<Persona> personas) throws IOException {

		// estos objetos son necesarios para leer/escribir en un archivo, así es
		// como se hace en java y no hay mucho que ver en ellos..
		OutputStream file = new FileOutputStream(actualFile);
		OutputStream buffer = new BufferedOutputStream(file);
		ObjectOutput escritor = new ObjectOutputStream(buffer);

		// escribo la lista de personas
		escritor.writeObject(personas);
		
		// libera el buffer
		escritor.flush();
		// cierra los flujos al archivo
		escritor.close();
		buffer.close();
		file.close();
	}
		

	
	
	
	/**
	 * 
	 * HINTS
	 * 
	 * Yo agregué aquí el método main aquí para hacer la prueba...
	 * Ustedes tienen una clase Ejecutor del cajero, ahí es donde deben
	 * crear los usuarios y después hacer las transacciones con sus cuentas,
	 * de esta manera, van a poder utililzar el cajero completamente...
	 * 
	 * 
	 * Para crear los usuarios, van a usar directamente la clase AccesoDBPersona y el método crearPersona..
	 * 
	 * Si copian y pegan el código de esta clase en su proyecto debería funcionar... Pero no copien el método main
	 * de aquí, ni el método crearTodosLosUsuariosDePrueba porque bueno... Eso lo tienen que hacer en su clase de Ejecutor..
	 * 
	 * (posiblemente al copiar y pegar el código les marque un error porque ustedes tienen una cosa hasta arriba que dice "package"... 
	 * 																							eso déjenlo en su clase, no lo quiten)
	 * (ningún otro error debería mostrarse aquí..)
	 * 
	 * 
	 * Cuando hagan sus transacciones de saldo y eso... cambien las propiedades de saldo a la persona y ocupen el método de actualizar persona
	 * para que se les vea reflejado dicho cambio.. (esto es en las clases que implementan la interface)
	 * 
	 * Si notan, tuve que agregar el try-catch para retener las excepciones... Ustedes deberían cachar las excepciones en las clases
	 * que implementan su interface cajero... Y sólo imprimir un mensajito que diga "error al acceder a la información" o algo así...
	 *
	 * 
	 * porfavor lean todos los comentarios para que vayan entendiendo las estrategias que se siguieron en todos los métodos
	 * y... yap :B
	 */
	
	public static void main(String[] iuhrhiu43rihu) {
		AccesoBDPersona acceso = new AccesoBDPersona();
		
		// primero genero tooooodos los usuarios con los que voy a trabajar
		crearTodosLosUsuariosDePrueba(acceso);
		
		System.out.println("******************************************************");
		
		// ahora ya hago las transacciones que yo quiera para checar que funcione
		try {
			Persona carlos = acceso.obtenerPersona(1);
			System.out.println("buscando carlos");
			System.out.println(carlos);
			

			// actualizo un par de datos
			carlos.setNombre("carlos jose");
			// al saldo que tenga, le aumento 5...
			carlos.setSaldo(carlos.getSaldo() + 5);
			
			// y guardo los cambios
			acceso.actualizarPersona(carlos);
			

			
			// si vuelvo a consultar a carlos..
			Persona carlosActualizado = acceso.obtenerPersona(1);
			System.out.println("buscando carlos");
			System.out.println(carlosActualizado);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("no encontro el archivo");
			System.out.println(e.getMessage());
		}
	}
	
	
	
	public static void crearTodosLosUsuariosDePrueba(AccesoBDPersona acceso) {
		try {
			

			Persona persona = new Persona();
			persona.setId(1);
			persona.setNombre("carlos");
			persona.setSaldo(10);
			
			
			// primero creo la persona
			acceso.crearPersona(persona);
			System.out.println("persona creada");
			System.out.println(persona);

			
			// voy a guardar ahora varios usuarios más para ver que el archivo
			// esté creándose correctamente
			// y validar que los métodos que hicimos para actualizar personas
			// funcionen cuando tenemos muchas personas en la base de datos
			
			Persona nuevaPersona = new Persona();
			nuevaPersona.setNombre("juan");
			nuevaPersona.setId(2);
			nuevaPersona.setSaldo(15);
			acceso.crearPersona(nuevaPersona);
			System.out.println("persona creada");
			System.out.println(nuevaPersona);

			
			
			
			Persona nuevaPersona1 = new Persona();
			nuevaPersona1.setNombre("pedro");
			nuevaPersona1.setId(3);
			nuevaPersona1.setSaldo(15);
			acceso.crearPersona(nuevaPersona1);
			System.out.println("persona creada");
			System.out.println(nuevaPersona1);
			
			
			Persona nuevaPersona2 = new Persona();
			nuevaPersona2.setNombre("ramon");
			nuevaPersona2.setId(4);
			nuevaPersona2.setSaldo(15);
			acceso.crearPersona(nuevaPersona2);
			System.out.println("persona creada");
			System.out.println(nuevaPersona2);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("no encontro el archivo");
			System.out.println(e.getMessage());
		}
		
	}
}
