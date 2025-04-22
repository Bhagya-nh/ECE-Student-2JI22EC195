package pack;

public class TestHippo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hippo h=new Hippo();
		h.setName("raja");
		h.setAge(10);
Hippo h1=new Hippo();
h1.setAge(10);

h1.setName("rani");
int i=5;
h1=h;
{
System.out.println("I am Hippo"+h.getAge());		
System.out.println("I am Hippo"+h.getName());
System.out.println("I am Hippo"+h1.getAge());		
System.out.println("I am Hippo"+h1.getName());
	}

}
}
