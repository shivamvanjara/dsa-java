import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
      Scanner s= new Scanner(System.in);
      System.out.print("enter a number: ");
      int n=s.nextInt();
      int original=n;
      int result=0;
      while(n>0)
      {
        int a=n%10;
        result=result*10+a;
        n=n/10;
        
      }
      if(result==original)
      {
        System.out.println(original+" is palindrome number");
      }
      else
      {
        System.out.println(original+" is not palindrome number");
      }
      
    }
}