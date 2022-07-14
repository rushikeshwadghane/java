import java.util.*;
import java.lang.String;
//Database Table
class Student
{
    public int RID;
    public String Name;
    public int Salary;

    public Student(int no, String str, int value)
    {
        this.RID  =no;
        this.Name = str;
        this.Salary  =value;
    }
    public void DisplayData()
    {
        System.out.println(this.Name+this.Salary);
        
    }


}
class DBMS
{
    LinkedList<Student> lobj ;

    public DBMS()
    {
        lobj = new LinkedList<>();
    }    
    public void StartDBMS()
    {
        System.out.println("DBMS started Successfuly:");
        Scanner scanobj = new Scanner(System.in);
        String Query = " ";
        while(true)
        {
            System.out.println("DBMS console:");
            Query  = scanobj.nextLine();
            String tokens[] = Query.split(" ");
            int QuerySize = tokens.length;
        }
    }
    public void InsertData(String str, int value)
    {
        Student sobj = new Student(value, str , value);
        lobj.add(sobj);
    }
    public void DispalyAll()
    {
        for(Student sref: lobj)
        {
            sref.DisplayData();
        }
    }
    public void DisplaySpecific(int rid)
    {
        for(Student sref:lobj)
        {
            if(sref.RID == rid)
            {
                sref.DisplayData();
                break;
            }
        }
    }
    public void Aggregate()
    {
        int iMax =0;
        Student temp = null;
        for(Student sref:lobj)
        {
            iMax = sref.Salary;
            temp = sref;
        }
        System.out.println("Student having maximum Salary");
    }
}

public class Collection {
    public static void main(String[] args)
    {
    //    Scanner sobj = new Scanner(System.in);

        Student obj = new Student(11, "rushi", 10000);
        Student obj2 = new Student( 2,"yogesh", 11000);
        
        DBMS dobj = new DBMS();
        System.out.println(obj.Name);
        System.out.println(obj.Salary);
        dobj.InsertData("xyz",12000);
        dobj.DispalyAll();
    }
}
