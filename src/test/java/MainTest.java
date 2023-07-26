import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class MainTest {

    @Test
    public void testLeapYearDivisibleBy400() {
        int year = 2000;
        int result = Main.calculateDaysInYear(year);
        int expectedDays = 366;

        Assertions.assertEquals(expectedDays, result);
    }

    @Test
    public void testLeapYearDivisibleBy4ButNotBy100() {
        int year = 2024;
        int result = Main.calculateDaysInYear(year);
        int expectedDays = 366;

        Assertions.assertEquals(expectedDays, result);
    }

    @Test
    public void testNonLeapYear() {
        int year = 2023;
        int result = Main.calculateDaysInYear(year);
        int expectedDays = 365;

        Assertions.assertEquals(expectedDays, result);
    }

    @Test
    public void testYearDividedBy100() {
        int year = 2100;
        int result = Main.calculateDaysInYear(year);
        int expectedDays = 365;

        Assertions.assertEquals(expectedDays, result);
    }

    @Test
    public void testCalculateDaysInYearPerformance() {
        int numberOfIterations = 100000; // Количество итераций для проверки производительности
        Random random = new Random();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < numberOfIterations; i++) {
            int randomYear = random.nextInt(2023) - 1000;
            Main.calculateDaysInYear(randomYear);
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        //Можно проверить, что для 2000 года количество дней равно 366
        int year2000 = 2000;
        int expectedDays = 366;
        int daysInYear2000 = Main.calculateDaysInYear(year2000);
        Assertions.assertEquals(expectedDays, daysInYear2000);

        // Выводим время выполнения на консоль
        System.out.println("Время выполнения для " + numberOfIterations + " итераций: " + executionTime + " мс.");
    }
}
