package dominio;

public class Localidad {
	
	private String nombre;
	private int numeroDeHabitantes;
	
	public String getNombre() {
		return nombre;	
	}
	
	public int getNumeroDeHabitantes() {
		return numeroDeHabitantes;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setNumeroDeHabitantes(int numeroDeHabitantes) {
		this.numeroDeHabitantes = numeroDeHabitantes;
	}
	
	@Override
	public String toString() {
		return "El nombre de la localidad es " + nombre + " y tiene " + numeroDeHabitantes + " habitantes.";
	}
	
	public Localidad(String nombre, int numeroDeHabitantes) {
		this.nombre = nombre;
		this.numeroDeHabitantes = numeroDeHabitantes;
	}
	
}

