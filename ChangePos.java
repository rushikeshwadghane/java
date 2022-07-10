//import java.lang.*;
import java.util.*;
class Bitwise
{
    public int OnBit(int iNO,int Pos)
    {

        int Mask = 0X00000001;
        Mask = Mask << (Pos-1);
        int iResult = iNO ^ Mask;
        return iResult;
    }
}
class program114       
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number");
        int value = sobj.nextInt();

        Bitwise bobj = new Bitwise();
        System.out.println("Enter bit Position");
        
        int iPos = sobj.nextInt();

        int  iret= bobj.OnBit(value,iPos);

           System.out.println(iret);
     
    }

}


// Standard templet Library