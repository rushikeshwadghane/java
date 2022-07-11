import java.util.*;

public class StringPattern2 {
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the string");
        String str = sobj.nextLine();
        char Arr[] = str.toCharArray();
     
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(Arr[j]+" ");
            }
            System.out.println();
        }
    }
}
