class Employee
{
    public String name;
    public int Salary;

    public Employee(String str ,int no )
    {
        this.name=str;
        this.Salary= no ;
    }
    public String toString()
    {
        return "Employee Name:"+name+" Having Salary: "+Salary;
    }
}
public class Object1 
{
    public static void main(String[] args) {
        
        Employee eobj = new Employee("Rushikesh", 37000);
        System.out.println(eobj.toString());


    }
    
}
