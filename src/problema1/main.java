package problema1;
import java.util.Scanner;
import java.util.ArrayList;
public class main
{
    public static void main(String[] args)
    {
        Scanner myobj = new Scanner(System.in);
        System.out.println("cati angajati aveti?");
        int n=myobj.nextInt();
        ArrayList<employee>employees=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            System.out.println("introduceti nume, email, rata pe ora, capacitate si zile libere");
            String name=myobj.nextLine();
            String email=myobj.nextLine();
            double hourrate=myobj.nextDouble();
            int capacity=myobj.nextInt();
            int freedays=myobj.nextInt();
            employee employee=new employee();
            employee.set()
            employees.add(employee);
        }
        for(employee employee:employees)
        {
            System.out.print("nume:"+employee.getName());
            System.out.print("salar pe luna:"+employee.getCalculatemonthlyincome());
        }
    }
}
