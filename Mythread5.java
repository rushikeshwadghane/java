import java.lang.Exception;
import java.io.*;
class Demo extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("value of i:"+i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception obj)
            {} 
        }
    }
}
public class Mythread5 
{
    public static void main(String[] args)throws Exception
     {
        Demo obj1 = new Demo();
        Thread t1 = new Thread(obj1);
        Demo obj2 = new Demo();
        Thread t2 = new Thread(obj2);

        t1.start();
        t1.join();
        t2.start();
    }
}
