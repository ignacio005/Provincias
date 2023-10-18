package aplicacion;
import dominio.Localidad;

public class Principal {
	
	public static void main(String[] args) {
		
		
		Localidad localidad1 = new Localidad("localidad 1", 12);
		Localidad localidad2 = new Localidad("localidad 2", 23);
		Localidad localidad3 = new Localidad("localidad 3", 35);
		Localidad localidad4 = new Localidad("localidad 4", 55);
		
		
		System.out.println(localidad1.toString());
		System.out.println(localidad2.toString());
		System.out.println(localidad3.toString());
		System.out.println(localidad4.toString());
		
	}

}
 