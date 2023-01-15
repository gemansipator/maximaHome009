package integer.to.binary;

import java.util.Scanner;

public class IntegerBinaryLoop {
    public static void binar(int a) {
        int i, b;
        while(a !=0 ) {
            b = a%2;
            System.out.print(b);
            a = a/2;
        }
    }
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int binar = s.nextInt();
        binar(binar);


    }
}
