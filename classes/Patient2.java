import java.lang.*;
public class Patient2
{
	public static void main(String args[])
	{
		Patient p1 = new Patient("Tanako", "231", "Male",20, "Corona");
		Patient p2 = new Patient("Minato","621", "Female",53, "Fever");
		Patient p3 = new Patient("Uenoyama","423", "Male",25, "Dengue");
		p1.displayinfo();
		Patient patients[] = new Patient[3];
		patients[0]=p1;
		patients[1]=p2;
		patients[2]=p3;
		System.out.println("--------------");
		patients[1].displayinfo();
		System.out.println("--------------");
		patients[2].displayinfo();
		InterfacePatient.disp();
	}
}
		