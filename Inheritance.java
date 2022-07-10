//import java.lang.*;
class Base
{
    public int i,j;
    public Base(){
        System.out.println("Inside Base Constructor");
    }
    public void fun()
    {
        System.out.println("Inside Base fun");

    }
    public void fun(int x)
    {
        System.out.println("Inside Base Parameterise costructor");
    }
    public void gun()
    {
        System.out.println("Inside Base gun");
    }
}

class Derived extends Base   //class Derived: public Base
{
    public int x,y;
    public Derived()
    {
        System.out.println("Inside Default Constructor");
    }
    public void sun()
    {
        System.out.println("Inside Derived Constructor");   
    }
}
//static
//{
  //  System.out.println("Iside Static Block");

//}
class Inheritance {
    public static void main(String arg[])
    {
        System.out.println("Inside Main function");
        Derived dobj = new Derived();

        dobj.fun();
        dobj.gun();
        dobj.fun(11);
        dobj.sun();
    }
}   
