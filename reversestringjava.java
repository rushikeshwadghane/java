import java.io.*;
import java.util.*;

public class reversestringjava
 {
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out .println("Enter the string :");
        String  str = sobj.nextLine();
        String newstr = str.replaceAll("\\s+"," ");

        String newstr2 = newstr.trim();
        String arr[] = newstr2.split(" ");
        int  ipos =0;
        int iMax =0 ;
        for (int i=0;i < arr.length;i++)
        {
            if(arr[i].length() >= iMax)
            {
                iMax = arr[i].length();
                ipos = i;
            }
        }
        System.out.println("Length of largest word is: "+iMax);
        System.out.println("Largest word is:"+arr[ipos]);
    }
}
