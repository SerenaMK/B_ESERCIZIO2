
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] carr = {"ART01", "ART02", "ART03"};
		
		Cliente cliente1 = new Cliente ("COD01", "Mario Rossi", "mario@gmail.com", "22/05/2022");
		Articolo articolo1 = new Articolo ("ART01", "Mouse da gaming.", 15.50, 8);
		Carrello carrello1 = new Carrello ("COD01", carr, 45.15);
		
		System.out.println("- CLIENTE -");
		cliente1.stampaCliente();
		
		System.out.println("\n- ARTICOLO -");
		articolo1.stampaArticolo();
		
		System.out.println("\n- CARRELLO -");
		carrello1.stampaCarrello();
		//System.out.println( "Articoli nel carrello:\n" + java.util.Arrays.toString(carrello1.articoli));
	}

}
