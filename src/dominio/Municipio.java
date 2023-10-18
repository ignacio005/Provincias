package dominio;
import java.util.ArrayList;

public class Municipio {
	
	public static void main(String[] args) {
		
		//Municipio 1
		
		ArrayList<Localidad> localidadesm1 = new ArrayList<Localidad>();
	    localidadesm1.add(new Localidad("localidad 1", 12));
	    localidadesm1.add(new Localidad("localidad 2", 23));
	    
	    for(Localidad e: localidadesm1) {
	    	System.out.println(e.toString());
	    }
	    int totalm1 = 0;
        for (Localidad data : localidadesm1) {
           totalm1 += data.numeroDeHabitantes; 
        }
        System.out.println("El número total de los habitantes del municipio 1 es: " + totalm1);
        
        
        //Municipio 2
        
        ArrayList<Localidad> localidadesm2 = new ArrayList<Localidad>();
	    localidadesm2.add(new Localidad("localidad 3", 35));
	    localidadesm2.add(new Localidad("localidad 4", 55));
	    
	    for(Localidad i: localidadesm2) {
	    	System.out.println(i.toString());
	    }
	    int totalm2 = 0;
        for (Localidad data : localidadesm2) {
           totalm2 += data.numeroDeHabitantes; 
        }
        System.out.println("El número total de los habitantes del municipio 2 es: " + totalm2);
	    
	    
	}
	
	
}
