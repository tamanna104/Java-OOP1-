import java.lang.*;
public class Nurse extends Information
{
    private double salary;
    public Nurse()
    {
      
    }
    public Nurse(String name,String id,String gender,double salary)
    {
        super(name,id,gender);
        this.salary=salary; 
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
    public double getSalary()
    {
        return salary;
    }
    public void showInfo()
    {
        System.out.println("Nurse Name: "+getName());
        System.out.println("Nurse ID: "+getID());
        System.out.println("Nurse Gender: "+getGender());
        System.out.println("Nurse Salary: "+salary);         
    }
}