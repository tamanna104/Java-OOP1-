public class Doctor2
{
	public static void main(String args[])
	{
		/*Appointment a1=new Appointment("8.00 - 10.00","monday");
		Appointment a2=new Appointment("8.00 - 10.00","monday");
		
		
		Doctor d1=new Doctor("Shakib","11","male","dentist",12);
		
		d1.confirmAppoinment(a1);
		d1.showInfo();
		d1.showAppointmentInformation();
		d1.confirmAppoinment(a2);*/
		Doctor d1=new Doctor("Shakib","11","male","dentist",12);
		Appointment a1=new Appointment("8.00am-10.00am","Monday");
		Appointment a2=new Appointment("11.00am-12.30pm","Tuesday");
		Appointment a3=new Appointment("10.00am-12.00pm","Thursday");
		d1.confirmAppointment(a1);
		d1.confirmAppointment(a2);
		d1.cancelAppointment(a1);
		d1.showAppointmentInformation();
	}
}