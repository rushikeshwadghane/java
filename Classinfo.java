class Demo 
{

}
public class Classinfo 
{
    public static void main(String[] args)
    {
       Demo obj = new Demo();
       
        Class cref = obj.getClass();

        System.out.println("Class name of obj id:"+cref.getName());
    }
    
}
