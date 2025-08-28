import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("enter number:");
        int number=s.nextInt();
        int result=1;
        while(number>0)
        {
            result=result*number;
            number--;

        }
        System.out.println("factorial is "+result);
    }
}
