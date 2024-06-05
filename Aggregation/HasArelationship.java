package My;

class Address 
{
	int pincode=989990;
	String Country = "India";
}
class Student
{
	int rollno = 03;
	String name = "Himanshu Mishra";
	Address b = new Address();	
}
public class HasArelationship
{
	public static void main(String[] args)
	{
		Student st = new Student();
		System.out.println(st.rollno);
		System.out.println(st.name);
		System.out.println(st.b.pincode);
		System.out.println(st.b.Country);
	}
}
