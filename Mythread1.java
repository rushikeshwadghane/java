import java.util.*;
import java.lang.*;
public class Mythread1 
{
    public static void main(String[] args) 
    {
        System.out.println("Inside Main");

        Thread tobj = Thread.currentThread();
        System.out.println("Nmae of current thread:"+tobj.getName());
    }
    
}
