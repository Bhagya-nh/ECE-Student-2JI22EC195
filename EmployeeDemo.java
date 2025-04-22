package pack;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee();
		e1.id=1;
		e1.name="Raju";
		e1.qualif="BE";
		e1.swim();
		System.out.println("The Name is "+e1.name);
		System.out.println("The id is "+e1.id);
		System.out.println("The qualif is "+e1.qualif);
		
		Employee e2= new Employee();
		e1.id=2;
		e1.name="Ram";
		e1.qualif="MBA";
		e1.swim();
		System.out.println("The Name is "+e1.name);
		System.out.println("The id is "+e1.id);
		System.out.println("The qualif is "+e1.qualif);
		

	}

}
