import java.lang.*;
public class Staff2
{
	public static void main(String args[])
	{
		Staff s1 = new Staff("Ash","456","Male","Caretaker",10500);
		s1.showInfo();
		System.out.println("--------------");
		Staff s2 = new Staff("Eiji","457","Male","SecurityGard",10500);
		s2.showInfo();
	}
}