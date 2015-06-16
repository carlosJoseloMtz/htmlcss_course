package littlegame;

public class baseTransferencia {
	

	public String obtenerNombre(int idmascota){
		BDatos acceso= new BDatos();
		mascota mascota=acceso.obtenerNombre(idmascota);
		String nombre=mascota.getNombre();
		return nombre;

}
	public String inicializarentretenimiento(int idmascota){
		BDatos acceso= new BDatos();
		mascota mascota=acceso.inicializarMascota(idmascota);
		String entretenimiento=Integer.toString(mascota.getEntretenimiento());
		return entretenimiento ;
}
	public String inicializarhambre(int idmascota){
		BDatos acceso= new BDatos();
		mascota mascota=acceso.inicializarMascota(idmascota);
		String hambre=Integer.toString(mascota.getHambre());
		return hambre ;
}
	public String inicializarlimpio(int idmascota){
		BDatos acceso= new BDatos();
		mascota mascota=acceso.inicializarMascota(idmascota);
		String limpio=Integer.toString(mascota.getLimpio());
		return limpio ;
}