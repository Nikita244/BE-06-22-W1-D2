package esercizio2;

public class Sim {
	String numero;
	double credito;
	double[] chiamate;
	
	public Sim(String num) {
		this.numero = num;
		this.credito = 0;
		this.chiamate = new double [5];
	}
	
	public void stampaDati() {
		System.out.println("Il tuo numero di telefono è: " + this.numero);
		System.out.println("Il tuo credito residuo è di: " + this.credito + " euro");
		
		System.out.println("Le tue ultime 5 chiamate sono:  ");
		for(int i = 0; i<this.chiamate.length; i++ ) 
		{
			if (this.chiamate[i] == 0) {
				System.out.println("Non hai chiamate recenti");
				break;
			} else { 
				System.out.println( (i+1) + ") " + this.chiamate[i]);
		}
		
		}
		}
		}


