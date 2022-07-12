import java.util.Scanner;


public class Bit {
    public static void main(String[] args) {
        Scanner sobj  =new Scanner(System.in);
        System.out.println("Enter number: ");
        int iNo = sobj.nextInt();

        int iMask = 0X0000000F;
        int iResult = iNo & iMask;
        if(iResult == iMask)
        {
            System.out.println("First nible is Complitly on");   
        }
        else
        {
            System.out.println("First nible is Off");
        }
    }
}
