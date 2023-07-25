import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год в формате yyyy: ");
        int year = scanner.nextInt();

        int result = calculateDaysInYear(year);

        System.out.println(year + " <нажмите enter>");

        if (result == 366) {
            System.out.println("Количество дней: 366 дней");
        } else {
            System.out.println("Количество дней: 365 дней");
        }
    }

    public static int calculateDaysInYear(int year) {
        if (year % 400 == 0) {
            return 366;
        } else if (year % 100 == 0) {
            return 365;
        } else if (year % 4 == 0) {
            return 366;
        } else {
            return 365;
        }
    }
}