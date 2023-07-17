import java.lang.*;
public class Hospital
{
    private String hname;
    private String address;
    public Hospital()
    {
        
    }
    public Hospital(String hname,String address)
    {
        this.hname=hname;
        this.address=address;
    }
    public void setName(String hname)
    {
        this.hname=hname;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public String getName()
    {
        return hname;
    }
    public String getAddress()
    {
        return address;
    }
	public void display()
	{
		System.out.println("Hospilta's Name : "+hname);
		System.out.println("Hospilta's Address : "+address);
	}
}