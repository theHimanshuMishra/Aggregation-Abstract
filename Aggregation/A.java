package My;

public class A 
{
	int pincode=989990;
	String Country = "India";
}
class Student
{
	int rollno = 03;
	String name = "Himanshu Mishra";
	A a = new A();	
}
class relationship
{
	public static void main(String[] args)
	{
		Student st = new Student();
		System.out.println(st.rollno);
		System.out.println(st.name);
		System.out.println(st.a.pincode);
		System.out.println(st.a.Country);
	}
}
