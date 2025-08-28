import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.err.print("enter number : ");
        int a= s.nextInt();
        boolean flag=true;
        if(a<=1)
        {
            System.err.println("a is not prime");
        }
        for(int i=2;i<=Math.sqrt(a);i++)
        {
            if(a%i==0)
            {
                flag=false;
                break;
            }
        }
        if(flag == true)
        {
            System.out.println(a+" is prime number.");
        }
        else
        {
            System.out.println(a + " not prime number.");
        }

    }
}
