
public class Cliente {
	
	String codiceCliente;
	String nomeCognome;
	String email;
	String dataIscrizione;
	
	public Cliente (String codiceCliente, String nomeCognome, String email, String dataIscrizione) {
		this.codiceCliente = codiceCliente;
		this.nomeCognome = nomeCognome;
		this.email = email;
		this.dataIscrizione = dataIscrizione;
	}
	
	public void stampaCliente() {
		System.out.println("Codice cliente: " + this.codiceCliente);
		System.out.println("Nome e cognome: " + this.nomeCognome);
		System.out.println("Email: " + this.email);
		System.out.println("Data iscrizione: " + this.dataIscrizione);
	}

}
