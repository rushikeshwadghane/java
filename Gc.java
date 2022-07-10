class Demo
{
    public int Arr[];
    public Demo(int size)
    {
        System.out.println("Allocating the resources in the constructor");
        this.Arr = new int[size];
    }
    protected void finalize()
    {
        System.out.println("Deallocating the resources in finalize");
        this.Arr=null;   
    }
}
public class Gc 
{
    public static void main(String[] args) 
    {
        Demo dobj = new Demo(10);
        dobj=null;
        System.gc();
        System.out.println("End of main");    
    }   
}
