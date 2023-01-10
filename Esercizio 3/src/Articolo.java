
public class Articolo {
	
	String codiceArticolo;
	String descrizione;
	double prezzo;
	int disponibili;
	
	public Articolo (String codiceArticolo, String descrizione, double prezzo, int disponibili) {
		this.codiceArticolo = codiceArticolo;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.disponibili = disponibili;
	}
	
	public void stampaArticolo() {
		System.out.println("Codice articolo: " + this.codiceArticolo);
		System.out.println("Descrizione:" + this.descrizione);
		System.out.println("Prezzo: " + this.prezzo);
		System.out.println("Pezzi disponibili: " + this.disponibili);
	}

}
