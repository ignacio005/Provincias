package presentacion;
import dominio.*;
import java.util.*;

public class Interfaz {
	
	private static Scanner sc = new Scanner (System.in);
	
	
	public static boolean procesarPeticion (String peticion, ArrayList <Provincia> l) {
		
		
		
		if(peticion==null) {
			
			System.out.println("Consulta ayuda");
			return true;
		}
		
		String[]p = peticion.split(": ");
		
		if (p.length>2) {
			
			System.out.println("Petición erronea");
			return true;
		}
		
		else if (p.length==1) {
			
			if (p[0].equals("Ayuda")) {
				
				System.out.println("Introduzca una de las siguientes peticiones: "
				+ "\n Anadir Provincia:(escribir provincia) "
				+ "\n Anadir Municipio: (escribe municipio) "
				+ "\n Anadir Localidad: (escribe localidad) "
				+ "\n Lista: (listar el contenido) "
				+ "\n Leer: (lectura inicial) "
				+ "\n Salir: (escribe salir)");
				
			}
			
			else if (p[0].equals("Lista")) {
				
				System.out.println(l);
				
			}
			
			else if (p[0].equals("Salir")) {
				
				return false;
				
			}
			
			else {
				
				System.out.println("Petición erronea. Pida ayuda.");
				return true;
				
			}
		}
		
		if (p[0].equals("Anadir Provincia")) {
			
			addProvincia(p[1], l);
		}
		
		if (p[0].equals("Anadir Municipio")) {
			
			addMunicipio(p[1], l);
		}
		
		if (p[0].equals("Anadir Localidad")) {
			
			addLocalidad(p[1], l);
		}
		return true;
	}
	
	public static void addProvincia(String nombre,ArrayList <Provincia> s) {
		
		Provincia p = new Provincia(nombre);
		s.add(p);
	}
	
	public static void addMunicipio(String nombre,ArrayList <Provincia> l) {
		
		Municipio m = new Municipio(nombre);
		
		for(int i=0; i<l.size(); i++) {
			
			System.out.println(i+":"+l.get(i).getNombre());
			
		}
		
		System.out.println("Introduzca número (posición) de la provincia: ");
		int i = Integer.parseInt(sc.nextLine());
		l.get(i).addMunicipio(m);
		
	}
	
	public static void addLocalidad (String nombre, ArrayList <Provincia> l) {
		
		
		for (int j=0 ; j<l.size();j++ ) {
			
			System.out.println(j+":"+(l.get(j)).getNombre());
		
		}
		System.out.println("Introduzca número (posición) de la provincia: ");
		int i=Integer.parseInt(sc.nextLine());
		
		Provincia p = l.get(i);
		ArrayList <Municipio> d=p.getmunicipios();
		for (int j=0 ; j<d.size();j++ ) {
			
			System.out.println(j+":"+(d.get(j)).getNombre());
		
		}
		System.out.println("Introduzca número (posición) del municipio: ");
		int j=Integer.parseInt(sc.nextLine());
		Municipio m= d.get(j);
		System.out.println("Introduzca número habitantes de la localidad: ");
		int numero=Integer.parseInt(sc.nextLine());
		Localidad c= new Localidad(nombre,numero);
		m.addLocalidad(c);
		
	}
	
	public static String leerPeticion() {
		
		System.out.print("?>");
		String cadena=sc.nextLine();
		return cadena;
		
	}

}
