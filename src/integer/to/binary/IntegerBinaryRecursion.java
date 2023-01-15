package integer.to.binary;

import java.util.Scanner;

public class IntegerBinaryRecursion {
    public static String toBinary(int n)
    {
        if (n == 0) {
            return "";
        }
        return toBinary(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int n = s.nextInt();
        int length = 12;

        String binary = String.format("%0" + length + "d", Integer.valueOf(toBinary(n)));
        System.out.println(binary);
    }

}
