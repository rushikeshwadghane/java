import java.util.*;
public class DigitPattern {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number:");
        int iNo  =sobj.nextInt();
        int i=0,j=0;
        String str = Integer.toString(iNo);
        char Arr[] = str.toCharArray(); //
        {
            for(i=Arr.length-1;i>=0;i--)
            {
                for(j=0;j<=i;j++)
                {
                    System.out.print(Arr[j]+" ");
                }
                System.out.println();
            }

        }

    }
}
