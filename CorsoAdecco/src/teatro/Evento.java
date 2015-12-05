package teatro;

import java.util.Date;

public class Evento
{
	private Biglietto[] biglietti;
	private Date data;
	String eventTitle;

	public Evento(Date data, String eventTitle) 
	{
		this.data = data;
		this.eventTitle = eventTitle;
	}
	
	public Biglietto[] getBiglietti() 
	{
		return biglietti;
	}

	public Date getData() 
	{
		return data;
	}
	
	public String getEventInfo()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("Evento "+eventTitle);
		sb.append("\n");
		sb.append("In rappresentazione il: "+data);
		sb.append("\n");
		sb.append("Biglietti venduti: "+biglietti.length);
		sb.append("\n");
		
		for(int i = 0; i< biglietti.length; i++)
		{
			//TODO
		}
		
		return sb.toString();
	}
	
}
