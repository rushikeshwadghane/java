import java.io.*;
import java.util.Scanner;
import java.lang.Exception;
import java.lang.*;
class Marvellous
{
    public int arr[];

    public Marvellous(int size)
    {
        arr = new int[size];
    } 

public void Accept()
{       

    Scanner sobj = new Scanner(System.in);
    System.out.println("Enter number:");
   
    for(int i=1;i<this.arr.length;i++)
    {
        this.arr[i]=sobj.nextInt();
    }

}
public void Disply()
{
    System.out.println("Data from Array is:");
    for(int i=1;i<this.arr.length;i++)
    {
        System.out.println(this.arr[i]); 
    }


}
public void DisplayEven()
{
    for(int i=1;i<this.arr.length;i++){


    if(this.arr[i]%2==0){
        System.out.println(this.arr[i]);
    }
   }
  }
}

class Demo extends Thread
{
    public Marvellous  mref;
    public Demo(Marvellous obj)
    {
        this.mref=obj;
    }
    public void run()  
    {

    }
}
class Mythread8
{
    public static void main(String args[]) throws Exception
    {
        Marvellous mobj1 = new Marvellous(5);
        Marvellous mobj2 = new Marvellous(8);
        mobj1.Accept();
        mobj1.Disply();

        Demo dobj1 = new Demo(mobj1);
        Demo dobj2 = new Demo(mobj2);

        mobj2.Accept();
        mobj2.Disply();

        Thread t1 = new Thread(dobj1);
        Thread t2 = new Thread(dobj2);
        t1.start();
        t2.start();

    }
    
}
