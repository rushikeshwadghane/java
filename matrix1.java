
import java.util.*;;
class matrix1
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int iRow = sobj.nextInt();
        System.out.println("Enter number of Colomn:");
        int iCol  = sobj.nextInt();

        int Arr[][] = new int[iRow][iCol];
        System.out.println("Enter the data:");
        for(int i=0; i<Arr.length;i++)
        {
            for(int j=0;j<Arr[i].length;j++)
            {
                Arr[i][j] = sobj.nextInt(); 
            }
        }
        System.out.println("Elements of array are:");
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
        Arr = null;
        
    }
}