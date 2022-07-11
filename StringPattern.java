import java.util.*;

public class StringPattern {
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the string");
        String str = sobj.nextLine();
        char Arr[] = str.toCharArray();
        System.out.println("Enter number of Row:");

        int iNo = sobj.nextInt();
        for(int i=0;i<iNo;i++)
        {
            for(int j=0;j< Arr.length;j++)
            {
                System.out.print(Arr[j]+" ");
            }
            System.out.println();
        }
    }
}
