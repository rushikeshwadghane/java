import java.util.*;

public class StringHashmap1 {
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the string");
        String str = sobj.nextLine();

        String Arr[] = str.split(" ");

        HashMap<String,Integer>hobj  = new HashMap<>(); 
        int Frequency=0;
        for(String ch:Arr)
        {
            if(hobj.containsKey(ch))
            {
                Frequency= hobj.get(ch);
                hobj.put(ch, Frequency+1);
            }
            else{
                hobj.put(ch,1);
            }
        }
        Set<String> setobj= hobj.keySet();
        int iMax =0;
        String c = " "; 
        for(String value :setobj)
        {
            if(iMax <(hobj.get(value)))
            {
                iMax = (hobj.get(value));
                c = value;
            }
        }
        System.out.println(c +" word occurs maximumum time in string ie "+iMax );

    }
}
