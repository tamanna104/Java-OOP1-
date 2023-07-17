import java.lang.*;
public class Doctor extends Information
{
    private String specialist;
    int room;
	Appointment appointments[] = new Appointment[3];
    public Doctor()
    {
       
    }
    public Doctor(String name, String id, String gender, String specialist, int room)
    {
        super(name,id,gender);
        this.specialist=specialist;
        this.room=room;
    }
    public void setSpecialist(String specialist)
    {
        this.specialist=specialist;
    }
    public void setRoom(int room)
    {
        this.room=room;
    }
    public String getSpecialist()
    {
        return specialist;
    }
    public int getRoom(int room)
    {
        return room;
    }
	public void confirmAppoitnment(Appointment appointment)
    {
        int flag=0;
        for(int i=0;i<appointments.length;i++)   
        {
            if(appointments[i]== null)
            {
            appointments[i]=appointment;
            flag=1;
            break;
            }
        }
        if(flag==1)
        {
            System.out.println("Confirmed Appointment");
        }
        else
        {
            System.out.println("Appointment can not be confirmed");
        }
    }
	public void cancelAppointment(Appointment appointment)
    {
        int flag=0;
        for(int i=0;i<appointments.length;i++)
        {
            if (appointments[i]==appointment)
            {
                appointments[i]=null;
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Canceled Appointment");
        }
        else
        {
            System.out.println("Appointment can not be canceled");
        }
    }
	 public void showInfo()
    {
        System.out.println("Doctor Name: "+getName());
        System.out.println("Doctor ID: "+getID());
        System.out.println("Doctor gender: "+getGender());
        System.out.println("Doctor Speciality: "+specialist);
        System.out.println("Doctor room: "+room);
              
    }
	public void showAppointmentInformation()
	{
		for(int i=0;i<appointments.length;i++)
		{
			if (appointments[i]!=null)
			{
				System.out.println("Course id is : "+appointments[i].getTime());
				System.out.println("Course name is : "+appointments[i].getDay());
			}
		}
	}
    
}