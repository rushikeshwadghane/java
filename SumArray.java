import java.util.*;

class ArrayX
{
    private int Arr[];

    public ArrayX(int iNo)
    {
        Arr = new int[iNo];
    }
    public void Accept()
    {
        int iCnt = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Value:");

        for(iCnt= 0;iCnt<Arr.length;iCnt++)
        {
            Arr[iCnt]= sobj.nextInt();
        }
    }
    public void Dispaly()
    {
        int iCnt=0;
        System.out.println("Element of Array:");
        for(iCnt= 0;iCnt<Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]);  
        }
    }
    public int Summation()
    {
        int iCnt=0,iSum=0;
        System.out.println("Element of Array:");
        for(iCnt= 0;iCnt<Arr.length;iCnt++)
        {
            iSum = iSum+Arr[iCnt]; 
        }
        return iSum;      
    }
}

public class program76 {
    public static void main(String[] args) {
   
        Scanner sobj = new Scanner(System.in);
        System.out.println("Element the Value for constructor:");
        int iLength = sobj.nextInt();

        ArrayX obj = new ArrayX(iLength);

        obj.Accept();
        obj.Dispaly();
        int iRet = obj.Summation();
        System.out.println("Addition is:"+iRet);
    }
}
