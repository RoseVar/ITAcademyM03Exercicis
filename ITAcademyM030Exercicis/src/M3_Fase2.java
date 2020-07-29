import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class M3_Fase2 {

	public static void main(String[] args) {
		// Exercici: L’exercici consisteix en mostrar per consola diferents noms de ciutats 
		//partint d’un array i modificar els noms canviant lletres.
		
		//fase1
		//Crea sis variables tipu string buides.
		String city1, city2, city3, city4, city5, city6;
		
		//Demana per consola que s’introdueixin els noms.
		Scanner scan = new Scanner(System.in);
		System.out.println("Entra el primer nom de ciutat: ");
		city1= scan.nextLine();
		System.out.println("Entra el segon nom de ciutat: ");
		city2= scan.nextLine();
		System.out.println("Entra el tercer nom de ciutat: ");
		city3= scan.nextLine();
		System.out.println("Entra el quart nom de ciutat: ");
		city4= scan.nextLine();
		System.out.println("Entra el cinquè nom de ciutat: ");
		city5= scan.nextLine();
		System.out.println("Entra el sisè nom de ciutat: ");
		city6= scan.nextLine();
		
		//Introdueix els següents noms de ciutats (Barcelona, Madrid, Valencia, Malaga, Cadis, Santander) per teclat.
											
		//---- FASE 2		
		//Un cop tenim els noms de les ciutats guardats en variables 
		//haurem de pasar l’informacio a un array (arrayCiutats).
		List<String> arrayCiutats = new ArrayList<String>();
		arrayCiutats.add(city1);
		arrayCiutats.add(city2);
		arrayCiutats.add(city3);
		arrayCiutats.add(city4);
		arrayCiutats.add(city5);
		arrayCiutats.add(city6);
		
		//Quan tinguem l’array ple, haurem de mostrar per consola el 
		//nom de les ciutats ordenadas per ordre alfabetic.
		Collections.sort(arrayCiutats);
		System.out.println("Aquestes són les ciutats en ordre alfabètic:");
		for (String ciutat: arrayCiutats) {
			System.out.println(ciutat);
		}
	}
}