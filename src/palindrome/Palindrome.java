package palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите текст на русском языке: ");
        String n = s.nextLine();

        int palindromeCount = 0;
        for(String word: n.split("[ ,.]")) {
            if(word.equals(new StringBuilder(word).reverse().toString())) {
                ++palindromeCount;
            }
        }
        System.out.println(palindromeCount);

    }
}
