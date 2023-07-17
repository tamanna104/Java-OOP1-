import java.lang.*;
import java.util.Scanner;
public class Start2
{
	public static void main(String args[])
	{
		Hospital h1 = new Hospital("Ibne cina", "Uttar Badda");
		h1.display();
		System.out.println("--------------------");
		System.out.println("Choose the option you want to know :");
		System.out.println("   1. Information.");
		System.out.println("   2. Facility. ");
		int n ;
		Scanner input =new Scanner(System.in);
		n = input.nextInt();
		switch(n)
		{
			case 1:
			{
				System.out.println("choose the sector of information you want to know :");
				System.out.println("	1. Doctor.");
				System.out.println("	2. Patiant.");
				System.out.println("	3. Nurse.");
				System.out.println("	4. Staff.");
				int a ;
				Scanner input1 =new Scanner(System.in);
				a = input1.nextInt();
				switch(a)
				{
					case 1: 
					{
						/*Appointment a1=new Appointment("8.00 - 10.00","monday");
						Appointment a2=new Appointment("8.00 - 10.00","monday");
		
		
						Doctor d1=new Doctor("Shakib","11","male","dentist",12);
		
						d1.confirmAppoinment(a1);
						d1.showInfo();
						d1.showAppointmentInformation();
						d1.confirmAppoinment(a2);*/
						System.out.println("choose the sector of information you want to know :");
						break;
					}
					case 2:
					{
						System.out.println("choose the sector of information you want to know :");
						break;
					}
					default:
					{
						System.out.println("choose valid option :");
						break;
					}
					
			}
			case 2:
			{
				System.out.println("choose the sector of information you want to know :");
				break;
			}
			default: System.out.println("choose valid option");
			break;
		}
	}
}
		