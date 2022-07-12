import java.util.Scanner;


public class Bit1 {
    public static void main(String[] args) {
        Scanner sobj  =new Scanner(System.in);
        System.out.println("Enter number: ");
         long iNo = sobj.nextInt();

        long iMask = 0XF000000F;
        long iResult = iNo & iMask;
        if(iResult == iMask)
        {
            System.out.println("First nible and Last nible complitely  on");   
        }
        else
        {
            System.out.println("First and Last nible is Off");
        }
    }
}
