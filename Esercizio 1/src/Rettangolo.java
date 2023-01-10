
public class Rettangolo {
	int altezza;
	int larghezza;
	
	public Rettangolo(int altezza, int larghezza) {
		this.altezza = altezza;
		this.larghezza = larghezza;
	}
	
	public int area () {
		return this.larghezza * this.altezza;
	}
	public int perimetro () {
		return (this.larghezza*2) + (this.altezza*2);
	}
	
	public void stampaRettangolo(Rettangolo rett) {		
		System.out.println("Area: " + rett.area());
		System.out.println("Perimetro: " + rett.perimetro());
		
	}
	
	public void stampaDueRettangoli(Rettangolo uno, Rettangolo due) {
		System.out.println("Rettangolo 1");
		this.stampaRettangolo(uno);
		System.out.println("\nRettangolo 2");
		this.stampaRettangolo(due);
		
		int sommaAree = uno.area() + due.area();
		int sommaPerimetri = uno.perimetro() + due.perimetro();
		
		System.out.println("\nSomma aree: " + sommaAree);
		System.out.println("Somma perimetri: " + sommaPerimetri);
	}
	
	

}
