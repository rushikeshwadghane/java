//import java.lang.*;
import java.util.*;
class node
{
    public int data;
    public node next;
}
class SinglyLL
{
    public node Head;
    public int Count;

    public SinglyLL()
    {
        Head = null;
        Count = 0;
    }
     public void InsertFirst(int no)
    {
        node newn = new node();
        
        newn.data = no;
        newn.next = null;

        newn.next = Head;
        Head  = newn;
        Count++;
    }
    public void InsertLast(int no)
    {
        node newn = new node();

        newn.data = no;
        newn.next = null;

        if(Head == null)
        {
            Head = newn;
        }
        else
        {
            node temp = Head;

            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newn;
        }
        Count++;
    }
    public void Display()
    {
        node temp = Head;
        System.out.println("Element in Linked List are:");
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    
    }
    public int CountNode()
    {
        return Count;
    }

}
public class program126 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        SinglyLL obj  = new SinglyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);
        obj.Display();
        obj.CountNode();

        
    }    
}
