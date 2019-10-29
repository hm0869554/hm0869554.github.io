
public class WeatherForecast {
	
	private String Skies = "";
	
	private int High = 0;
	
	private int Low = 0;
	
	public void setSkies(String NewSkies) 
	{
		Skies = NewSkies;
	}
	
	public void setHigh(int NewHigh)
	{
		High = NewHigh;
	}
	
	public void setLow (int NewLow)
	{
		Low = NewLow;
	}
	
	public String getSkies()
	{
		return Skies;
	}
	
	public int getHigh()
	{
		return High;
	}
	
	public int getLow()
	{
		return Low;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
