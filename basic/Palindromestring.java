import java.util.*;
public class Palindromestring {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter string : ");
        String str1=s.next();
        int l=str1.length();    
        String str2="";
        for(int i=l-1;i>=0;i--)
        {
            str2=str2+str1.charAt(i);
        }
        if(str1.equals(str2))
        {
            System.out.println("string is palindrome");
        }
        else 
        {
            System.out.println("string is not palindrome");
        }
    }
}
