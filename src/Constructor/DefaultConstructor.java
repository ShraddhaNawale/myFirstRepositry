package Constructor;

public class DefaultConstructor {

	public static void main(String[] args) {
	DefaultConstructor d=new DefaultConstructor();
	d.name("shraddha", 12, 30, 'M',"A+");

	}


public void name(String name,int No, int age, char Gender, String  Blood_group)
{
	System.out.println("My name is ="+name);
	System.out.println("My no is ="+No);
	System.out.println("My age is ="+age);
	System.out.println("My Gender is ="+Gender);
	System.out.println("My BloodGruop is ="+Blood_group);
}
}