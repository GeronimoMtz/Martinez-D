package EjecucionHilo;

public class Hilo extends Runnable{

	public Hilo(String Nombre) {
		super(Nombre);
	}

	public static void main(String[]args)
	{
		Runnable hilo1=new Runnable("hilo 1");
		Runnable hilo2=new Runnable("hilo 2");
		Runnable hilo3=new Runnable("hilo 3");
		Runnable hilo4=new Runnable("hilo 4");

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
	}
}
