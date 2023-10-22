package dominio;
import java.util.ArrayList;

public class Municipio {
	
	String nombre;
	int numeroDeHabitantes;
	ArrayList<Localidad> localidades;
	public Municipio(String nombre) {
		
		this.localidades= new ArrayList <Localidad>();
		this.nombre=nombre;
	}
	public int getNumeroDeHabitantes() {
		numeroDeHabitantes=0;
		for(Localidad localidad:localidades) {
			numeroDeHabitantes+=localidad.getNumeroDeHabitantes();	
		}
		
		return numeroDeHabitantes;
		
	}
	public void addLocalidad(Localidad l) {
		localidades.add(l);
	}
	public ArrayList <Localidad> getlocalidades(){
		return localidades;
	}
	public String getNombre() {
		return nombre;
	}
	@Override
	public String toString() {
		return "El nombre del municipio es " + nombre + " y tiene " + getNumeroDeHabitantes() + " habitantes.";
	}
	
	
	
	
	
	
	
}


	
	
	
	
	
	
	
	
	
	

	
	