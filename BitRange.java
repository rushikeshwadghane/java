import java.util.Scanner;

public class BitRange {
    public static void main(String[] args) {
        Scanner sobj  =new Scanner(System.in);
        System.out.println("Enter number: ");
         int  iNo = sobj.nextInt();
         System.out.println("Enter starting bit pos: ");
         int iStart = sobj.nextInt();

         System.out.println("Enter ENding point : ");
         int  iEnd= sobj.nextInt();         

        int iMask1 = 0xffffffff;
        int iMask2 = 0xffffffff;
        int iMask = 0 ;
        iMask1 = iMask1<<(iStart-1);
        iMask2 = iMask2>>(32-iEnd);

        iMask = iMask1 & iMask2;
        int iResult = iNo & iMask;

        if(iResult==iMask)
        {
            System.out.println("Bits  are on");   
        }
        else
        {
            System.out.println("Bit  is Off");
        }
    }
}
