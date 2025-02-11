package samplejavaproject2;
import static java.lang.Double.*;
import static java.lang.Math.*;
public class Exx21 {
public static void main(String args[])
{
	double radius=parseDouble(args[0]);
	double area=PI*pow(radius,2);
	System.out.println("Area of circle:"+area);
	
}
}

