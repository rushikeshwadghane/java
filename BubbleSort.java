import java.lang.*;
import java.util.*;

interface MarvellousSort
{
    public void Accept();
    public void Display();
    public void BubbleSort();
    public void InsertionSort();
    public void SelectionSort();
}

class Array implements MarvellousSort
{
    public int Arr[];

    public Array(int iSize)
    {
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter elements");
        for(int i= 0;i <Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public void Display()
   { int start=0,end=length-1,middle=0;
        System.out.println("Elements of the array are");
        for(int i= 0;i <Arr.length; i++)
        {
           System.out.println(Arr[i]);
        }
   }

   public void BubbleSort()
   {
        int i=0,j=0,temp=0;
        boolean Swap = false;
        for(i=0;i<Arr.length;i++)
        {
            Swap = false;
            for(j=0;j<Arr.length-i-1;j++)         
            {
                if(Arr[j]>Arr[j+1])
                {
                    temp = Arr[j];
                    Arr[j]=Arr[j+1];
                    Arr[j+1]= temp; 
                    Swap = true;
                }
            }
            if(Swap == false)
            {
                break;
            }
        }   
   }

   public void InsertionSort()
   {}

   public void SelectionSort()
   {}
}

class BubbleSort
{
    public static void main(String arr[])
    {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the size of array : ");
            int size = sobj.nextInt();

            Array aobj = new Array(size);
            aobj.Accept();
            aobj.Display();
            aobj.BubbleSort();
            System.out.println("Array After Sorting:");
            aobj.Display();
    }
}
