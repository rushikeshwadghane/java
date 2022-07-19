
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
class Searching extends Array
{
    public Searching(int iSize)
    {
        super(iSize);
    }
   public int BinarySearch(int iNo)
   {
        int Middle =0,iStart=0,iEnd=(Arr.length-1);
        while(iStart <= iEnd)
        {
            Middle = (iStart +iEnd)/2;
            if(iNo == Arr[Middle])
            {
                break;
            }
            if(iNo > Arr[Middle])
            {
                iStart = Middle+1;
            }
            else if(iNo < Arr[Middle])
            {
                iEnd = Middle-1;
            }
        }
        if(Arr[Middle]==iNo)
        {
            return Middle;
        }
        else
        {
            return -1;
        }
        
   }

}
class ArrayBinarySearch 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size = sobj.nextInt();
       
        Searching aobj = new Searching(size);
        aobj.Accept();
        aobj.Display();

        System.out.println("Enter the element that you want to search");
        int iValue = sobj.nextInt();

      //  int iRet = aobj.LinearSearch(iValue);
      //  int iRet = aobj.BiDirectionalSearch(iValue);
        int iRet = aobj.BinarySearch(iValue);
        if(iRet== -1)
        {
            System.out.println("There is no such element");
        }
        else{
            System.out.println("Element is there is the array at index :"+iRet);
        }

    }
    
}

