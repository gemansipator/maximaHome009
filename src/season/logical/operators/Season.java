package season.logical.operators;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите номер месяца, согласно календаря с 1 до 12: ");
        int months = s.nextInt();
        if (months <= 0){
            System.out.println("Введите целое число с 1 до 12");
        } else if (months >12) {
            System.out.println("Введите целое число с 1 до 12");
        } else {
            String monthString;
            switch (months) {
                case 1:
                    monthString = "Январь";
                    System.out.println(monthString);
                    break;
                case 2:
                    monthString = "Февраль";
                    System.out.println(monthString);
                    break;
                case 3:
                    monthString = "Март";
                    System.out.println(monthString);
                    break;
                case 4:
                    monthString = "Апрель";
                    System.out.println(monthString);
                    break;
                case 5:
                    monthString = "Май";
                    System.out.println(monthString);
                    break;
                case 6:
                    monthString = "Июнь";
                    System.out.println(monthString);
                    break;
                case 7:
                    monthString = "Июль";
                    System.out.println(monthString);
                    break;
                case 8:
                    monthString = "Август";
                    System.out.println(monthString);
                    break;
                case 9:
                    monthString = "Сентябрь";
                    System.out.println(monthString);
                    break;
                case 10:
                    monthString = "Октябрь";
                    System.out.println(monthString);
                    break;
                case 11:
                    monthString = "Ноябрь";
                    System.out.println(monthString);
                    break;
                case 12:
                    monthString = "Декабрь";
                    System.out.println(monthString);
                    break;
            }

        }
    }
}
