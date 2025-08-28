import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        System.err.print("enter total digit of series : ");
        Scanner s= new Scanner(System.in);
        int digit=s.nextInt();
        int a=0;
        int b=1;
        for( int i=0;i<digit;i++)
        {
            if(i == 0)
            {
                System.out.println(a);
            }
            else if(i==1)
            {
                System.out.println(b);
            }
            else 
            {
                int c=a+b;
                System.err.println(c);
                a=b;
                b=c;
            }

        }
    }
}
