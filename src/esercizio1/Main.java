package esercizio1;

public class Main {

	public static void main(String[] args) {
		Rettangolo elem1 = new Rettangolo(10,21.2);
		Rettangolo elem2 = new Rettangolo(14,28.2);
		stampaRettangolo(elem1);
		
		System.out.println("------------------------------------");
		
		stampaDueRettangoli(elem1, elem2);
	}

	static void stampaRettangolo(Rettangolo el) {
		System.out.println("L'area del rettangolo è: " + el.calcArea());
		System.out.println("Il perimetro del rettangolo è: " + el.calcPerimetro());
	}
	
	static void stampaDueRettangoli(Rettangolo elm1, Rettangolo elm2) {
		System.out.println("1.Rettangolo l'area è di " + elm1.calcArea() + " e il perimetro è di " + elm1.calcPerimetro());
		System.out.println("2.Rettangolo l'area è di " + elm2.calcArea() + " e il perimetro è di " + elm2.calcPerimetro());
	}
}
