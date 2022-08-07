
import java.lang.*;



abstract class Base
{
    
    public abstract void fun();
    {
        System.out.println("Inside fun");
    }

}
class Derived extends Base
{
    public void fun()
    {
        System.out.println("Inside derived fun");
    }
}


public class overloading {
    public static void main(String[] args) 
    {
        Base obj = new Derived();
        obj.fun();   
    }
}   
