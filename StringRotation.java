import java.util.*;
public class StringRotation {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter first String");
        String str1 =sobj.nextLine();
        System.out.println("Enter second String");
        String str2 =sobj.nextLine();

        if(str1.length()!=str2.length())
        {
            System.out.println("String are not rotation");
            return;
        }
        String str3 = str1 + str1;
        if(str3.contains(str2))
        {
            System.out.println("String are in rotation:");
        }
        else{
            System.out.println("String are not in rotation");
        }

    }
}
