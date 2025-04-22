package pack;

public class Cal {
	void add(int a,int b)
	{
		System.out.println("The sum is" + (a+b));
	}
    void show()
    {
    	System.out.println("This is inheritance");
    }
}
class scientific extends Cal
{
	void SineCosone(int angle)
	{
		System.out.println("This is an angle");
	}
}