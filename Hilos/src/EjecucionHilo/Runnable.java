package EjecucionHilo;

public class Runnable extends Thread
{
	public String Nombre;
	
	
	public Runnable(String Nombre)
	{
		this.Nombre=Nombre;
	}
	@Override
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Nombre+"--"+i);
		}
	}

}
