import java.lang.*;
import java.util.*;

class Array
{
    public int Arr[];
    public Array(int iSize)
    {
        Arr = new int[iSize];
    }
    protected void finalize()
    {
        Arr = null;
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter element");
        for(int i=0;i<Arr.length;i++)
        {
            Arr[i]= sobj.nextInt();
        }
    }
    public void Display()
    {
        System.out.println("Element from Array:");
        for(int i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }
    }
}
public class ArrayAccept 
{
    public static void main(String[] args) {
        Array aobj = new Array(5);
        aobj.Accept();
        aobj.Display();
    }
    
}