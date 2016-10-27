import java.io.*;
public class fact
{
   int no,fact,n;
   public static void main( String args[])
   {
     System.out.println("Enter a number");
     no=Integer.parseInt(System.readLine());
     n=no;
    
     while(no>=1)
     {
          fact=fact*(no-1);
          no=no-1;
     }
   
   System.out.println("Factorial of"+n+"="+fact);
  }
}
