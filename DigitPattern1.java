import java.util.*;
public class DigitPattern1 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number:");
        int iNo  =sobj.nextInt();
        int Sum=0;    
        while(Sum>=0)
        {
            while(iNo!=0)
            {
                Sum = Sum+(iNo%10);
                System.out.print(iNo%10+"+");
                iNo = iNo/10;

            }
            iNo = Sum;
            System.out.print(" = "+Sum);
            System.out.println();
            Sum =0;
            if(iNo<10)
            {
                break;
            }

        }   
    }
}
