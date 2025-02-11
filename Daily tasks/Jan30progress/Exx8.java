package samplejavaproject2;

public class Exx8 {
@SuppressWarnings("unused")
private int empId,years;
private String empName;
@SuppressWarnings("unused")
private double sal,Annsal;
public void getEmployeeDetails()
{
    System.out.println("Employee id="+empId);
    System.out.println("Employee name="+empName);
    System.out.println("Employee sal="+sal);}
public void setEmployeeDetails(int empId,String empName,double sal)
{
    this.empId=empId;
    this.empName=empName;
    this.sal=sal;
}
public void getLoanEligibility(double Annsal,int years)
{
    this.Annsal=Annsal;
    this.years=years;
    if(years>5)
    {
        if(Annsal>600000 && Annsal<1000000)
            System.out.println("2 lakh loan granted\n");
        else if(Annsal>=1000000)
            System.out.println("5 lakh loan granted\n");
        else if(Annsal>=1500000)
            System.out.println("7 lakh loan granted\n");
    }
}
}
