package pack;

public interface Pet {
	void activity();

}
class parrot extends Animal1 implements Pet
{
	public void activity()
	{
		System.out.println("The parrot fly");
	}
	
	public void eat()
	{
		System.out.println("The animal eats");
	}
}