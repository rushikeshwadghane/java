import java.util.*;
import LogicBuildingMatrix.*;

class MyMatrix extends Matrix
{
    public MyMatrix(int a,int b)
    {
        super(a,b);
    }
    public int Minimum()
    {
        int iMin = Arr[0][0];
        for(int i=0;i<iRow;i++)
        {
            for(int j=0;j<iCol;j++)
            {
                if(Arr[i][j]<iMin)
                {
                    iMin = Arr[i][j];
                }
            }
        }
        return iMin
    }
}

public class MinelementArray
 {
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int X = sobj.nextInt();
        System.out.println("Enter number of Colomn:");
        int Y  = sobj.nextInt();

        MyMatrix mobj = new MyMatrix(X, Y);
        mobj.Accept();
        mobj.Display();
        int iret = mobj.Minimum();
        System.out.println("Minimum element: "+iret);
    }
}
