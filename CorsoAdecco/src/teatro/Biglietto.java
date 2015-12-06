package teatro;

public class Biglietto 
{
	private Posto posto;
	private Utente utente;

	public Biglietto(Posto posto, Utente utente)
	{
		this.posto = posto;
		this.utente = utente;
	}

	public Posto getPosto()
	{
		System.out.println("posto ritornato");
		return posto;
	}

	public Utente getUtente()
	{
		System.out.println("utente ritornato");
		return utente;
	}
	

}
