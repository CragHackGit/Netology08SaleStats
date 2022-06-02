package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatServiceTest {

    @Test
    void totalSalesTestEquals() {
        StatsService service = new StatsService();

        long[] salesStatistic = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.totalSales(salesStatistic);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    void averageSalesTestEquals() {
        StatsService service = new StatsService();

        long[] salesStatistic = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.averageSales(salesStatistic);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void minSalesTestEquals() {
        StatsService service = new StatsService();

        long[] salesStatistic = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.minSales(salesStatistic);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxSalesTestEquals() {
        StatsService service = new StatsService();

        long[] salesStatistic = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.maxSales(salesStatistic);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void monthsBelowAverageTestEquals() {
        StatsService service = new StatsService();

        long[] salesStatistic = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.monthsBelowAverage(salesStatistic);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void monthsAboveAverageTestEquals() {
        StatsService service = new StatsService();

        long[] salesStatistic = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.monthsAboveAverage(salesStatistic);

        Assertions.assertEquals(expected, actual);
    }
}