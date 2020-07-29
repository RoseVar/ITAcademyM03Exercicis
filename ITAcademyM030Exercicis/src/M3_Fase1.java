import java.util.Scanner;

public class M3_Fase1 {

	public static void main(String[] args) {
		// Exercici: L’exercici consisteix en mostrar per consola diferents noms de ciutats 
		//partint d’un array i modificar els noms canviant lletres.
		
		//----FASE 1
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
		
		//Mostra per consola el nom de les 6 ciutats.
		System.out.println("El primer nom de ciutat es: " + city1);
		System.out.println("El segon nom de ciutat es: " + city2);
		System.out.println("El tercer nom de ciutat es: " + city3);
		System.out.println("El quart nom de ciutat es: " + city4);
		System.out.println("El cinquè nom de ciutat es: " + city5);
		System.out.println("El sisè nom de ciutat es: " + city6);

	}

}
