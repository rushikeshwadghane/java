import java.util.*;

class Matrix
{
    public int iRow;
    public int iCol;
    public int Arr[][];
    public Matrix(int a,int b)
    {
        this.iRow = a;
        this.iCol = b;
        Arr = new int [iRow][iCol];
    }
    protected void finalize()
    {
        Arr = null;
        System.gc();
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the data:");
        for(int i=0; i<Arr.length;i++)
        {
            for(int j=0;j<Arr[i].length;j++)
            {
                Arr[i][j] = sobj.nextInt(); 
            }
        }
    }
    public void Display()
    {
        {
            for(int i=0; i<Arr.length;i++)
            {
                for(int j=0;j<Arr[i].length;j++)
                {
                    System.out.print(Arr[i][j]+" "); 
                }
                System.out.println();
            }
        }
    }
}

public class matrix1oop
 {
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int X = sobj.nextInt();
        System.out.println("Enter number of Colomn:");
        int Y  = sobj.nextInt();

        Matrix mobj = new Matrix(X, Y);
        mobj.Accept();
        mobj.Display();
    }
}
