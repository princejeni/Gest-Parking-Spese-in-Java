package tecnicosoftware;
import java.util.Scanner;
public class GestParkingMio {
	static int x,y,z;
	static int numeroPostiDisponibili;

	public static void main(String[] args) {
		
		initPark();
		
		startPark();
		
	}
	
	public static void initPark() {
		Scanner numPark = new Scanner(System.in);
		System.out.println("Quanti sono lato1?: ");
		int lato1 = numPark.nextInt();
		System.out.println("Quanti sono lato2?: ");
		int lato2 = numPark.nextInt();
		System.out.println("Quanti sono i numeri dei Piani?: ");
		int npiani = numPark.nextInt();
		x = lato1;
		y = lato2;
		z = npiani;
		
		numeroPostiDisponibili = getNumParks();
	}
	
	public static int getNumParks() {
		int result = 0;
		
		result = x*y*z;
		
		return result;
	}
	
	public static void infoParking() {
		System.out.println("-------PARK APERTO------"+" Posti Disponibili sono:    "+ numeroPostiDisponibili+" su "+ getNumParks());
		if(numeroPostiDisponibili>0) {
			System.out.println("Scrivi 'IN' per Entrare O Scrivi 'OUT' per Uscire");}
			else {System.out.println(" POSTO COMPLETO!!!. Scrivi 'OUT' per Uscire.");
	}
	}
	
	public static boolean gestGate() {
		boolean open = true;
		
		Scanner pulsante = new Scanner(System.in);
		
		
		String comando = pulsante.nextLine();
		
		if(comando.equalsIgnoreCase("IN")) 	
		{
			if(numeroPostiDisponibili>0) {
			numeroPostiDisponibili--;
		
			System.out.println("Posti Liberi sono: "+numeroPostiDisponibili);}
			else {
				System.out.println("Posti Pieni!!!. Non si può Entrare Adesso");
			}
		}
		
		if (comando.equalsIgnoreCase("OUT")) {
			if(numeroPostiDisponibili<getNumParks()) {
			numeroPostiDisponibili++;
			System.out.println("Posti Liberi sono: "+numeroPostiDisponibili);}
			else {
				System.out.println("Il Parcheggio è Vuoto!!! Uscita Negata");
			}
		}
		
		if(comando.equals("EscI")) {
			open = false;
		}
		
	return open;	
	}
	
	public static void startPark() {
		boolean aposto = true;
		while(aposto) {
		infoParking();
		aposto = gestGate();
		}
	}
	
	
	}
	
	
	


