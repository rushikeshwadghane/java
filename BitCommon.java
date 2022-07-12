import java.util.Scanner;

public class BitCommon {
    public static void main(String[] args) {
        Scanner sobj  =new Scanner(System.in);
        System.out.println("Enter First number: ");
         int  iNo1 = sobj.nextInt();
         System.out.println("Enter Second number: ");
         int iNo2 = sobj.nextInt();

        int iNo = iNo1 & iNo2;        

        int iMask = 0x000000001;
       
        for(int i=1;i<=32;i++)
        {
            int iResult = iNo & iMask;

            if(iResult==iMask)
            {
                System.out.println(i);   
            }
            iMask = iMask<<1;
        }

    }
}
