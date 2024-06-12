package Area;

public class Squar extends Rectangle {
	private int area;
	void squar(int length,int breadth)
	{
		area=length*breadth;
	}
	@Override
	public String toString() {
		return "Squar [area=" + area + "]";
	}
}
