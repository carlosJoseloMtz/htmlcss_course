package pokemon;

public class Pokemon {

	private int edad;
	private String nombre;
	private int nivelAtaque;
	private String tipoDePokemon;
	
	public String getTipoDePokemon() {
		return tipoDePokemon;
	}
	public void setTipoDePokemon(String tipoDePokemon) {
		this.tipoDePokemon = tipoDePokemon;
	}
	public int getNivelAtaque() {
		return nivelAtaque;
	}
	public void setNivelAtaque(int nivelAtaque) {
		this.nivelAtaque = nivelAtaque;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
