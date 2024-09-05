import java.util.Scanner;
class Driverr {   
    public String name;
    public String phone;
    public String email;
    public String addrees;
    public void DriverData()
    {   System.out.printf("name of driver : %s",this.name);
        System.out.printf("\nemail of driver : %s",this.email);
        System.out.printf("\nphone number of driver : %s",this.phone);
        System.out.printf("\naddress of driver : %s",this.addrees);
    }  
}
public class MyMainClassInput {
    public static void main(String args[]) {
        Driverr d=new Driverr();
        Scanner driver=new Scanner(System.in);
        System.out.printf("enter driver's name : ");
        d.name=driver.nextLine();
        System.out.printf("enter driver's phone number : ");
        d.phone=driver.nextLine();
        System.out.printf("enter driver's email : ");
        d.email=driver.nextLine();
        System.out.printf("enter driver's address : ");
        d.addrees=driver.nextLine();
        d.DriverData();
        driver.close();
    }
}
