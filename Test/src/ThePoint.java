
public class ThePoint {
	private int x;
	private int y;
	
	public ThePoint(){
		x = 0;
		y = 0;
	}
	public ThePoint(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public static double distance(ThePoint obj1, ThePoint obj2)
	{
		return Math.sqrt(Math.pow(obj1.getX() - obj2.getX(),2)+Math.pow(obj1.getY()-obj2.getY(), 2));
		
	}

}
