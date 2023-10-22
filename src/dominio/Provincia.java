package dominio;
import java.util.ArrayList;

public class Provincia {
	
	String nombre;
	int numeroDeHabitantes;
	ArrayList<Municipio> municipios;
	public Provincia(String nombre) {
		
		this.municipios= new ArrayList <Municipio>();
		this.nombre=nombre;
	}
	public int getNumeroDeHabitantes() {
		numeroDeHabitantes=0;
		for(Municipio municipio: municipios) {
			numeroDeHabitantes+=municipio.getNumeroDeHabitantes();	
		}
		
		return numeroDeHabitantes;
		
	}
	public void addMunicipio(Municipio m) {
		municipios.add(m);
	}
	public ArrayList <Municipio> getmunicipios(){
		return municipios;
	}
	public String getNombre() {
		return nombre;
	}
	@Override
	public String toString() {
		return "El nombre de la provincia es " + nombre + " y tiene " + getNumeroDeHabitantes() + " habitantes.";
		

	}
}

