
public class Rettangolo {
	double altezza;
	double larghezza;
	
	public Rettangolo(double altezza, double larghezza) {
		this.altezza = altezza;
		this.larghezza = larghezza;
	}
	
	public double area () {
		return this.larghezza * this.altezza;
	}
	public double perimetro () {
		return (this.larghezza*2) + (this.altezza*2);
	}
	
	public void stampaRettangolo(Rettangolo rett) {		
		System.out.println("Area:" + rett.area());
		System.out.println("Perimetro:" + rett.perimetro());
		
	}
	
	public void stampaDueRettangoli(Rettangolo uno, Rettangolo due) {
		System.out.println("Rettangolo 1");
		this.stampaRettangolo(uno);
		System.out.println("\nRettangolo 2");
		this.stampaRettangolo(due);
		
		double sommaAree = uno.area() + due.area();
		double sommaPerimetri = uno.perimetro() + due.perimetro();
		
		System.out.println("\nSomma aree: " + sommaAree);
		System.out.println("Somma perimetri: " + sommaPerimetri);
	}
	
	

}
