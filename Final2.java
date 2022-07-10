class Base
{
    public void fun()
    {
        System.out.println("Inside base fun");
    }
    public final void gun()
    {
        System.out.println("Inside base gun");

    }
}
class Derived extends Base
{
    public void fun()
    {
        System.out.println("Inside Derived fun");
    }
 /*   public  void gun()
    {
        System.out.println("Inside Derived gun");

    } */

}
public class Final2 {
    public static void main(String arg[])
    {
        Base obj = new Base();
        obj.fun();
        obj.gun();
    }    
}
