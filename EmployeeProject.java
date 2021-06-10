
package employee.project;

import java.util.*;

public class EmployeeProject {

    public static void main(String[] args) {
        System.out.println("Enter the employee name whom details you want:\n1.Robert\n2.Sam\n3.John");
        System.out.println("Please enter the employee name carefully or just copy and paste the employee name whom details you want ");
        Scanner s=new Scanner(System.in);
        String name;
        name=s.nextLine();
        EmployeeProject ob=new EmployeeProject();
        if("Robert".equals(name))
        {
            ob.Robert();
        }
        else if("Sam".equals(name))
        {
            ob.Sam();
        }
        else if("John".equals(name))
        {
            ob.John();
        }
        else
        {
            System.out.println("INVALID NAME\n 1.Please chect whether you enter the correct employee name\n2.The first letter should be in capital letter\n3.just copy and paste the employee name whom details you want");
        }
        
    }
    public int Robert()
    {
        System.out.println("Year of joining:1994\nAddress:64C-WallsStreet\nSalary-50K");
        return 0;
    }
    public int Sam()
    {
        System.out.println("Year of joining:2000\nAddress:68D-WallsStreet\nSalary-38K");
        return 0;
    }
    public int John()
    {
        System.out.println("Year of joining:1999\nAddress:26B-WallsStreet\nSalary-38K");
        return 0;
    }
}

