package sum.of.all.numbers;

import java.util.Scanner;

public class SumAllNumbersWhile {
    public static void main(String[] args) {

        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число: ");
        n = s.nextInt();
        if (n <= 0){
            System.out.println("Ошибка. Просим Вас ввести целое положительное число...");
            return;
        }

        int sum = 0;


        System.out.println();

//        for (int i = 1; i <= n; i++){
//            System.out.print(i + " ");
//                sum += i;
//        }
        int i = 1;
        while (i<=n){
            System.out.print(i + " ");
            sum += i;
            i++;
        }
        System.out.println("\nСумма всех чисел: " + sum);



    }
}
