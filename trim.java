import java.io.*;
import java.util.*;

public class trim
 {
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out .println("Enter the string :");
        String  str = sobj.nextLine();
        String newstr = str.replaceAll("\\s+"," ");

        String newstr2 = str.trim();
        String arr[] = newstr2.split("");
        
        System.out .println("Number of words are"+arr.length);
        
    }
}
