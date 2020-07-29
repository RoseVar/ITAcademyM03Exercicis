import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class M3_Fase4 {

	public static void main(String[] args) {
		// Exercici: L’exercici consisteix en mostrar per consola diferents noms de ciutats 
		//partint d’un array i modificar els noms canviant lletres.
		
		//fase1, 2, 3
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
											
		
		//--- FASE 4
		//Creeu un nou array per cada una de les ciutats que tenim. La mida dels nous arrays sera la llargada de
		//cada string ( string nomCiutat.Length).
		String[] arrayCity1= new String[city1.length()];
		String[] arrayCity2= new String[city2.length()];
		String[] arrayCity3= new String[city3.length()];
		String[] arrayCity4= new String[city4.length()];
		String[] arrayCity5= new String[city5.length()];
		String[] arrayCity6= new String[city6.length()];
		
		//Ompliu els nous arrays lletra per lletra.
		for (int i=0; i<city1.length();i++) {
			arrayCity1[i]= String.valueOf(city1.charAt(i));			
		}
		for (int i=0; i<city2.length();i++) {
			arrayCity2[i]= String.valueOf(city2.charAt(i));			
		}
		for (int i=0; i<city3.length();i++) {
			arrayCity3[i]= String.valueOf(city3.charAt(i));			
		}
		for (int i=0; i<city4.length();i++) {
			arrayCity4[i]= String.valueOf(city4.charAt(i));			
		}
		for (int i=0; i<city5.length();i++) {
			arrayCity5[i]= String.valueOf(city5.charAt(i));			
		}
		for (int i=0; i<city6.length();i++) {
			arrayCity6[i]= String.valueOf(city6.charAt(i));			
		}
		
				
		//Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB).
		System.out.println("Les ciutats erntrades, amb els noms invertits ");
		Collections.reverse(Arrays.asList(arrayCity1)); 
		for (String lletra: arrayCity1) {
			System.out.print(lletra);
		}
		System.out.println("");
		Collections.reverse(Arrays.asList(arrayCity2)); 
		for (String lletra: arrayCity2) {
			System.out.print(lletra);
		}
		System.out.println("");
		Collections.reverse(Arrays.asList(arrayCity3)); 
		for (String lletra: arrayCity3) {
			System.out.print(lletra);
		}
		System.out.println("");
		Collections.reverse(Arrays.asList(arrayCity4)); 
		for (String lletra: arrayCity4) {
			System.out.print(lletra);
		}
		System.out.println("");
		Collections.reverse(Arrays.asList(arrayCity5)); 
		for (String lletra: arrayCity5) {
			System.out.print(lletra);
		}
		System.out.println("");
		Collections.reverse(Arrays.asList(arrayCity6)); 
		for (String lletra: arrayCity6) {
			System.out.print(lletra);
		}
	}
}