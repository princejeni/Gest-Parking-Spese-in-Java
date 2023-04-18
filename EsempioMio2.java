package tecnicosoftware;

import java.util.Scanner;

public class EsempioMio2 {

	public static void main(String[] args) {
		Scanner insNome = new Scanner(System.in);
		Scanner inSpesa = new Scanner(System.in);
		
		boolean errore = false;
		int numpax =0;
		
		do {
		try {
			Scanner insNum = new Scanner(System.in);
			
		System.out.println("Quanti Partecipanti ci sono?");
		numpax = insNum.nextInt();
		
		if (numpax>0 && numpax<=30) {
				errore = false;
		}
		
		else {
				errore = true;
				System.out.println("Inserisci un numero tra 1 e 30");
		}
		}
		
		catch(Exception e) {
			errore= true;
			System.out.println("Inserisci un numero");
		}
		
		}

		while (errore== true);
		
		
		String elNome[] = new String[numpax]; 
		float elSpese[] = new float[numpax];
		
		for(int i=0; i<elSpese.length; i++) {
		
			System.out.println("Dimmi il tuo nome");
			String nome = insNome.nextLine();
			elNome[i] = nome;
			if(nome.equals("")) {
				System.out.println("Nome" + (i+1));
			}
			
			boolean aposto = false;
			
			while(! aposto) {
			try {
			System.out.println("Quanto hai speso?");
			float spesa = inSpesa.nextFloat();
			elSpese[i] = spesa;
			if (spesa>0 && spesa <=2000) {
				aposto = true;
			}
			else {
				System.out.println("inserisci un numero tra 1 e 2000");
			}
			}
			catch(Exception e){
				aposto= false;
				System.out.println("Devi inserire solo numeri");
			}
		}
			
			
		}
		
		for (int i =0; i<elSpese.length; i++) {
			String riga = elNome[i] + " ha speso " + elSpese[i];	
			System.out.println(riga); 
		}
		
		
		float spesaTotale=0;
		float spesaSingola=0;
		
		for(int i =0; i<elSpese.length; i++) {
			spesaTotale = spesaTotale + elSpese[i];
		}
		
		spesaSingola = spesaTotale/elSpese.length;
		System.out.println(" Spesa ciascuno: "+spesaSingola);
		
		for(int i = 0; i<elSpese.length; i++) {
			String finale = elNome[i]+ " : ha speso " + elSpese[i] + " : debito "+ (spesaSingola - elSpese[i])
					+ " : %debito "+ (Math.round(elSpese[i]/spesaSingola)*100) + "%";
			System.out.println(finale);
		}
		
		
	}

}
