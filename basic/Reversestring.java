import java.util.Scanner;

public class Reversestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string: ");
        String str1=sc.next();
        String str2="";
        int l=str1.length();
        for(int i=l-1;i>=0;i--)
        {
            str2=str2+str1.charAt(i);
        }
        System.out.println("reversed string is : "+str2);

    }
}
