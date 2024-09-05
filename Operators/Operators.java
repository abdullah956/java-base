import java.util.Scanner;
public class Operators {
    public static void main(String args[])
    {   Scanner num=new Scanner(System.in);
        System.out.printf("enter first number : ");
        int a=num.nextInt();
        System.out.printf("enter second number : ");
        int b=num.nextInt();
        System.out.printf("both numbers are equal : %b",a==b);
        System.out.printf("\nboth numbers are not equal : %b",a!=b);
        System.out.printf("\n1st number is greater than 2nd number : %b",a>b);
        System.out.printf("\n1st number is smaller than 2nd number : %b",a<b);
        System.out.printf("\n1st number is greater than and equal to 2nd number : %b",a>=b);
        System.out.printf("\n1st number is less than and equal to 2nd number : %b",a<=b);
        num.close();
    }
}
