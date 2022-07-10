import java.lang.*;
import java.util.*;

public class Input2 {
    public static void main (String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter your name :");
        String name = sobj.nextLine();

        System.out.println("Enter your age");
        int Age =sobj.nextInt();

        System.out.println("Enter your percentage");

        float percentage = sobj.nextFloat();


        System.out.println("Your Name is: " +name);

        System.out.println("your age: " +Age);

        System.out.println("Your Mark is:"+percentage);
        sobj.close();
    }
}
