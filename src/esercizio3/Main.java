package esercizio3;

public class Main {

	public static void main(String[] args) {
		Articoli pane = new Articoli ("5789", "Cibo", 0.99, 50);
		Cliente cliente1 = new Cliente("457", "Mario Rossi", "mario@rossi.it", "05/01/2023");
		Carrello carrello1 = new Carrello ("16", "lorem", 201);
		
		stampa(pane);
		System.out.printf(" %n ------------------------- %n ");
		stampa(cliente1);
		System.out.printf(" %n ------------------------- %n ");
		stampa(carrello1);

	}
	
	static void stampa(Articoli e) {
		System.out.printf("Codice: %s %n Descrizione: %s %n Prezzo: %f %n Pezzi Disponibili: %d",
												e.codice, e.descrizione, e.prezzo, e.pezzi);
	}
	
	static void stampa(Cliente e) {
		System.out.printf("Codice: %s %n Dati: %s %n Email: %s %n Data Iscrizione: %s",
												e.codice, e.dati, e.email, e.iscrizione);
	}
	
	static void stampa(Carrello e) {
		System.out.printf("Cliente Associato: %s %n Elenco dati: %s %n totCosto: %f",
												e.cliente, e.elencoArt, e.costoArt);
	}

}
