0import java.lang.*;
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
   {
        System.out.println("Elements of the array are");
        for(int i= 0;i <Arr.length; i++)
        {
           System.out.println(Arr[i]);
        }
   }

   public void BubbleSort()
   { 
        int i=0,j=0,temp=0;
        for(i=0;i<Arr.length;i++)
        {
            for(j=i+1;j<Arr.length-i-1;j++)         
            {
                if(Arr[j]>Arr[j+1])
                {
                    temp = Arr[j];
                    Arr[j]=Arr[j+1];
                    Arr[j+1]= temp; 
                }
            }
        }   
   }
   public void InsertionSort()
   {
        int i=0,j=0,selected=0;
        for(i=0;i<Arr.length;i++)
        {
            for(j= i-1,selected=Arr[i];(j>=0)&&(Arr[j]>selected);j--)
            {
                Arr[j+1] = Arr[j];
            }
            Arr[j+1]= selected;
        }
   }

   public void SelectionSort()
   {
       int i=0,j=0,min_index = 0,temp =0;
       for(i=0;i<Arr.length-1;i++)
       {
             min_index=i;
            for(j=i;j<Arr.length;j++)
            {
               
                if(Arr[min_index]> Arr[j])
                {
                    min_index = j;
                }
            }
                if(i!= min_index)
                {
                    temp = Arr[i];
                    Arr[i]= Arr[min_index];
                    Arr[min_index]= temp;	
                }    
       }
   }
}

class Sorting
{
    public static void main(String arr[])
    {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the size of array : ");
            int size = sobj.nextInt();

            Array aobj = new Array(size);
            aobj.Accept();
           // aobj.Display();
         //   aobj.BubbleSort();
              
         //   aobj.SelectionSort();
            aobj.Display();
              aobj.InsertionSort();

            System.out.println("Array After Sorting:");
            aobj.Display();

    }
}
