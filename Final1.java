//import java.lang.*;
class Demo
{
    public int i;
    public final int j=20;
    public final int k;

    public Demo()
    {
        this.i=10;
        this.k=30;
    }
    public Demo(int a, int b)
    {
        this.i=a;
        this.k=b;
    }
    public void fun()
    {
        i++; //allowed
        //j++ & K++   not allowed
    }
}

class Final1
{
    public static void main(String arg[])
    {
        Demo obj = new Demo();
        Demo obj1 = new Demo(11,21);

        obj.fun();
        obj1.fun();
    }
}