import java.util.*;
public class Armstrongnumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number : " );
        int num =sc.nextInt();
        int original=num;
        int digit = String.valueOf(num).length(); 
        int sum=0;
        while(num>0)
        {
          int digit1=num%10;
          sum+= Math.pow(digit1, digit);
          num=num/10;
        }
        if(sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }
    }
}