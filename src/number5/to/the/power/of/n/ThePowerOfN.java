package number5.to.the.power.of.n;

import java.util.Scanner;

public class ThePowerOfN {
    public static int PowA(int x, int n)
    {
        if (n==0)
            return 1;
        return PowA(x,n-1)*x;
    }

    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        //System.out.print("x = ");
        int x = 5;      //int x = myObj.nextInt();
        System.out.print("n = ");
        int n = myObj.nextInt();
        int pow=PowA(x,n);
        System.out.println("Pow("+x+", "+n+") = "+pow);
    }

}
