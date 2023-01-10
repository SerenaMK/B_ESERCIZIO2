
public class Carrello {
	
	String cliente;
	String[] articoli;
	double totale;
	
	public Carrello (String cliente, String[] articoli, double totale) {
		this.cliente = cliente;
		this.articoli = articoli;
		this.totale = totale;
	}
	
	public void stampaCarrello() {
		System.out.println("Cliente: " + this.cliente);
		System.out.println("Articoli nel carrello: " + java.util.Arrays.toString(this.articoli));
		System.out.println("Totale: " + this.totale + "€");
	}

}
