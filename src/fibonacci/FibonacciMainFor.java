package fibonacci;

import java.util.Scanner;

public class FibonacciMainFor {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int n;
        int sum_fib;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число: ");
        n = s.nextInt();
        for(int i = 0; i < n; i++){
            sum_fib = a + b;
            a = b;
            b = sum_fib;
            System.out.print(sum_fib + " ");
        }
    }
}
/*
Числа Фибоначчи — это последовательность натуральных чисел, которая начинается
 с чисел ноль и один, а каждое последующее число равно сумме двух предыдущих:

F = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...}

F0 = 0, F1 = 1, Fn = Fn - 1 + Fn - 2;

n ≥ 0, n ∈ Z
Стоит отметить, что иногда 0 опускается, и ряд начинается с 1 1 2 3…

Как правило в условиях задачи сразу уточняется, с каких первых двух чисел
начинается ряд (0,1 или 1,1)
 */