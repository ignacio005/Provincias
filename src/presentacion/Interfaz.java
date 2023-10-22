package presentacion;
import java.io.*;
import dominio.*;
import java.util.*;

public class Interfaz {
	
	public static ArrayList <Provincia> Leer(){
		
		ArrayList <Provincia> provincias = new ArrayList <>();
		Scanner sc = new Scanner (System.in);
		System.out.println("Nombre de la provincia");
		
		while (sc.hasNext()) {
			String nombre= sc.nextLine();
			System.out.println("El nombre de la Provincia 1 es " + nombre + ".");
			provincias.add(new Provincia (nombre));
		}
		
		return provincias;
	
}
}