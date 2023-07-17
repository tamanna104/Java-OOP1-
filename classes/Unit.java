import java.lang.*;
public class Unit extends Facility
{
	private String corona_unit;
	private String dengue_unit;
	public Unit()
	{
 
	}
	public Unit(String corona_unit,String dengue_unit)
	{
		this.corona_unit=corona_unit;
		this.dengue_unit=dengue_unit;
	}
	public void setCoronaunit(String corona_unit)
	{
		this.corona_unit=corona_unit;
	}
	public void setDengueunit(String dengue_unit)
	{
		this.dengue_unit=dengue_unit;
	}
	public String getCoronaunit()
	{
		return corona_unit;
	}
	public String getDengueunit()
	{
	return dengue_unit;
	}
		public void showInfo()
	{
		System.out.println("Corona Unit:"+corona_unit);
		System.out.println("Dengue Unit:"+dengue_unit);
	}
}