public class Room extends Facility
{
	private int wardnum, cabinnum;
	public Room()
	{
	}
	public Room(int wardnum, int cabinnum)
	{
		this.wardnum = wardnum;
		this.cabinnum = cabinnum;
	}
	public void setWardNum(int wardnum)
	{
		this.wardnum = wardnum;
	}
	public void setCabinNum(int cabinnum)
	{
		this.cabinnum = cabinnum;
	}
	public void showInfo()
	{
		System.out.println("Ward Number :"+wardnum);
		System.out.println("Cabin Number :"+cabinnum);
	}
}