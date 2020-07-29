import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class M3_Fase3 {

	public static void main(String[] args) {
		// Exercici: L’exercici consisteix en mostrar per consola diferents noms de ciutats 
		//partint d’un array i modificar els noms canviant lletres.
		
		//fase1, 2
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
											
		//Un cop tenim els noms de les ciutats guardats en variables haurem de pasar l’informacio a un array (arrayCiutats).
		List<String> arrayCiutats = new ArrayList<String>();
		arrayCiutats.add(city1);
		arrayCiutats.add(city2);
		arrayCiutats.add(city3);
		arrayCiutats.add(city4);
		arrayCiutats.add(city5);
		arrayCiutats.add(city6);
		
		//--- FASE 3
		//Cambieu les vocals “a” dels noms de les ciutats per el numero 4 i 
		//guardeu els noms modificats en un nou array(ArrayCiutatsModificades).
		List<String> arrayCiutatsModificades = new ArrayList<String>();
		for (String ciutat:arrayCiutats) {
			String ciutatProv= ciutat.replace('a', '4');
			arrayCiutatsModificades.add(ciutatProv);
		}
		
		
		//Mostreu per consola l’array modificat i ordenat per ordre alfabetic.
		Collections.sort(arrayCiutatsModificades);
		System.out.println("Aquestes són les ciutats amb les 'a' modificades en ordre alfabètic:");
		for (String ciutat: arrayCiutatsModificades) {
			System.out.println(ciutat);
		}
	}
}