package aplicacion;
import java.util.*;
import dominio.Localidad;
import dominio.Municipio;
import dominio.Provincia;
import presentacion.Interfaz;

public class Principal {
	
	public static void main(String[] args) {
		
		
		Localidad localidad1 = new Localidad("localidad 1", 12);
		Localidad localidad2 = new Localidad("localidad 2", 23);
		Localidad localidad3 = new Localidad("localidad 3", 35);
		Localidad localidad4 = new Localidad("localidad 4", 55);
		Municipio municipio = new Municipio("Municipio 1");
		Provincia provincia = new Provincia("Provincia 1");
		municipio.addLocalidad(localidad1);
		municipio.addLocalidad(localidad2);
		municipio.addLocalidad(localidad3);
		municipio.addLocalidad(localidad4);
		provincia.addMunicipio(municipio);
		
		
		System.out.println(localidad1.toString());
		System.out.println(localidad2.toString());
		System.out.println(localidad3.toString());
		System.out.println(localidad4.toString());
		System.out.println(municipio.toString());
		System.out.println(provincia.toString());
		
		String p;
		ArrayList <Provincia> lista = new ArrayList <Provincia>();
		Boolean seguir;
		do {
			p=Interfaz.leerPeticion();
			seguir=Interfaz.procesarPeticion(p, lista);
		}
		while(seguir);

}
} 