public abstract class Car2 implements Location2
{
	private int ID;
	private double[] location = new double[2];
	
	public Car2()
	{
		ID = (int) (Math.random() * 1000000) + 1;
	}
	
	public void move(double x, double y)
	{
		location[0] += x;
		location[1] += y;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public double[] getLoc()
	{
		return location; 
	}
}
