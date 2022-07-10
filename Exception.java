import java.util.*;
 class Exception {
     public static void main(String ard[])
     {
         Scanner sobj = new Scanner(System.in);

         System.out.println("Enter first number");
         int no1 = sobj.nextInt();

         System.out.println("Enter second number");
         int no2 = sobj.nextInt();

         int ans = no1/no2;

         System.out.println("Division is: " +ans);
         sobj.close();
     }
    
}
