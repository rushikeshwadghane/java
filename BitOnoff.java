//import java.lang.*;
import java.util.*;
class Bitwise
{
    public int OnBit(int iNO)
    {
        int Mask = 0X00000048;
        int iResult = iNO ^ Mask;
        return iResult;
    }
}
class program113           
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number");
        int value = sobj.nextInt();

        Bitwise bobj = new Bitwise();

        int  iret= bobj.OnBit(value);

           System.out.println(iret);
     
    }

}