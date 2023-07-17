public class Pharmacy
{
    private String name;
    private String location;
    Hospital hospital;
    public Pharmacy()
    {   
    }
    public Pharmacy(String name,String location)
    {
        this.name=name;
        this.location=location;   
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setLocation(String location)
    {
        this.location=location;
    }
    public void setHospital(Hospital hospital)
    {
        this.hospital=hospital;
    }
    public Hospital getHospital()
    {
        return hospital;
    }
    public String getName()
    {
        return name;
    }
    public String getLocation()
    {
        return location;
    }
    
    public void showDetails()
    {
        System.out.println("Name is : "+name);
        System.out.println("Location is : "+location);
        hospital.displayInfo();

 

    }
}