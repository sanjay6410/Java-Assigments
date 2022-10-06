
public abstract class Vehicle 
{
	public void start()
	{
	  System.out.println("Start Button is Pressed .....");	
	}
	public void stop()
	{
		System.out.println("Stop Button is Pressed ......");
	}
	public abstract void accelerate();
	public abstract void applyBrakes();
	public void driveSomeDistance()
	{
		start();
		accelerate();
		applyBrakes();
		stop();
	}
	
	public static void main(String[] args) {
		Vehicle es=new ElectricScooter();
		es.driveSomeDistance();
	}

}
