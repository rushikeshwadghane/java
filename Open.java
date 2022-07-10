import java.util.*;
import java.io.*;
import java.lang.*;

class Open
{
    public static void main(String[] args)
    
    {
    try
    {    
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter file name");
        String Filename = sobj.nextLine();

        File fobj = new File(Filename);
        boolean bobj = fobj.createNewFile();


        if(bobj == true)
        {
            System.out.println("file create succesfully");
        }
        else{
            System.out.println("file is already existing");
        }
    }
    catch(IOException obj){
        System.out.println(obj);
    } 
    }
}