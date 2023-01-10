
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rettangolo r1 = new Rettangolo(10, 15);
		Rettangolo r2 = new Rettangolo(20, 35);
		
		System.out.println("- STAMPA RETTANGOLO -");
		r1.stampaRettangolo(r2);
		
		System.out.println("");
		
		System.out.println("- STAMPA DUE RETTANGOLI -");
		r1.stampaDueRettangoli(r1, r2);

	}

}
