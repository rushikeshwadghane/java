import java.util.*;
class Number
{
    private int iNo;
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number:");
        this.iNo = sobj.nextInt();
    }
    public void Dispaly()
    {
        System.out.println("Value is :"+this.iNo); 
    }
    public int Factorial()
    {
        {
            int iFact=1;
            int iCnt=0;
            for(iCnt=1;iCnt<=iNo;iCnt++)
            {
                iFact= iFact*iCnt; // or iFact* =iCnt;
            }
            return iFact;
        }
    }
}
class program73
{
    public static void main(String[] args)
    {
        Number nobj = new Number();
        nobj.Accept();
        nobj.Dispaly();
        int iret= nobj.Factorial();         
        System.out.println("Factorial is :"+iret);   

    }
}    