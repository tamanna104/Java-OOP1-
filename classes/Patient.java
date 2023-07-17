import java.lang.*;
public class Patient extends Information implements InterfacePatient
{
	private int age;
	private String disease;
	public Patient()
	{
	}
	public Patient(String name,String id,String gender,int age, String disease)
	{
		super(name, id, gender);
		this.age = age;
		this.disease = disease;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void  setDisease(String disease)
	{
		this.disease = disease;
	}
	public int getAge()
	{
		return this.age;
	}
	public String getDisease()
	{
		return this.disease;
	}
	
	public void displayinfo()
	{
		System.out.println("Name :" +getName());
		System.out.println("ID :" +getID());
		System.out.println("Gender :" +getGender());
		System.out.println("age :" +age);
		System.out.println("disease :" +disease);
	}

}
	