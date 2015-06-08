import java.io.Serializable;


public class Persona implements Serializable {

	private int id = -1;
	private int saldo;
	private String nombre;
	private String foto;
	
	// metodos de acceso set y get
	
	public void setId(int id) {
		if (this.id == -1) {
			// this se refiere a ESTA CLASE
			this.id = id;
		} else {
			// TODO: mandar una alerta a administracion foidsiofsda
		}
	}
	
	public int getId() {
		// puedo o no ponerle el this
		return id;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
	@Override
	public String toString() {
		// creo un texto para cuando quiera imprimir directamente a la persona...
		String texto = "persona=" + this.nombre + ", id=" + this.id + ", saldo=" + this.saldo;
		return texto;
	}
	
}
