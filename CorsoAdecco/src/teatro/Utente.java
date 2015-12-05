package teatro;

public class Utente
{
	private String userId;
	private Biglietto[] biglietti;

	public Biglietto[] getBiglietti()
	{
		return biglietti;
	}

	public void setBiglietti(Biglietto[] biglietti)
	{
		this.biglietti = biglietti;
	}

	public String getUserId()
	{
		return userId;
	}

	public Utente(String userId)
	{
		this.userId = userId;
	}

}
