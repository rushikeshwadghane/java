//import java.lang.*;
import java.util.*;
class Bitwise
{
    public boolean CheckBit(int iNO)
    {
        int Mask=64,Result=0;
        Result = iNO&Mask;
        if(Result==0)
        {
            return false;Result=0;
            Result = iNO^Mask;
            
        
            return Result;
        
        }
        else{
             return true;
         }
    }
}
class program109
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number");
        int value = sobj.nextInt();

        Bitwise bobj = new Bitwise();

       boolean bret= bobj.CheckBit(value);


       if(bret== true)
       {
           System.out.println("Bit is On");
       }
       else
       {
        System.out.println("Bit is off");

       }
    }

}