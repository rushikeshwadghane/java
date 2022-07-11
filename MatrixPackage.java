import java.util.*;

import LogicBuildingMatrix.*;

public class MatrixPackage
 {
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int X = sobj.nextInt();
        System.out.println("Enter number of Colomn:");
        int Y  = sobj.nextInt();

        Matrix mobj = new Matrix(X, Y);
        mobj.Accept();
        mobj.Display();
    }
}
