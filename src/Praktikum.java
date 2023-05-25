import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            // здесь нужно вывести результат
            System.out.println("Этот " + year + " год високосный.");
        } else
            System.out.println("Этот " + year + " год НЕ високосный.");
    }

    public static boolean isLeapYear(int year) {
        // здесь нужно определить, является ли переданный год високосным
        if ((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0) {
            return true;
        } else
            return false;
    }
}
