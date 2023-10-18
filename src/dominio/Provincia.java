package dominio;
import java.util.ArrayList;

public class Provincia {

	public static void main(String[] args) {
		
		ArrayList<Localidad> municipios = new ArrayList<Localidad>();
	    municipios.add(new Localidad("municipio 1", 35));
	    municipios.add(new Localidad("municipio 2", 90));
	    
	    for(Localidad a: municipios) {
	    	System.out.println(a.toString());
	    }
	    int totalprovincia = 0;
        for (Localidad data : municipios) {
           totalprovincia += data.numeroDeHabitantes; 
        }
        System.out.println("El número total de los habitantes del la provincia es: " + totalprovincia);

	}

}
