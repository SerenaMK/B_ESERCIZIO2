
public class Sim {
	
	String numero;
	double credito = 0;
	String[][] chiamate = {
			{},
			{},
			{},
			{},
			{}
	};
	
	public Sim (String numero, double credito, String[][] chiamate) {
		this.numero = numero;
		this.credito = credito;
		this.chiamate = chiamate;
	}
	
	public void stampaDato() {
		System.out.println("Numero: " + this.numero);
		System.out.println("Credito disponibile: " + this.credito);
		System.out.println("Ultime 5 chiamate:\n" + java.util.Arrays.deepToString( this.chiamate ));
	}
	

}
