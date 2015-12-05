package teatro;

public class Posto 
{
	private int numeroPosto, numeroFila, categoria;

	public Posto(int numeroPosto, int numeroFila, int categoria)
	{
		super();
		this.numeroPosto = numeroPosto;
		this.numeroFila = numeroFila;
		this.categoria = categoria;
	}

	public int getNumeroPosto() 
	{
		return numeroPosto;
	}

	public int getNumeroFila()
	{
		return numeroFila;
	}

	public int getCategoria()
	{
		return categoria;
	}
	
}
