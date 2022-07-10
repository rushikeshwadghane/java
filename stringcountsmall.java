import java.io.*;
import java.util.*;

public class stringcountsmall {
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out .println("Enter the string :");
        String  str = sobj.nextLine();

        char arr[] = str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            System.out .println(arr[i]);
        }
    }
}
