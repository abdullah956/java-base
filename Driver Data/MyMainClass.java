class Driver
{   public String name;
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
public class MyMainClass {
    public static void main(String args[]) 
    {
        Driver d=new Driver();
        d.name="aaa aaa";
        d.addrees="aaaaa 3, aaaaaaaa, 3 aaaaa, aaaaaa ";
        d.email="a1a2a3a4a5@gmail.com";
        d.phone="1234567890";
        d.DriverData();
    }
}
