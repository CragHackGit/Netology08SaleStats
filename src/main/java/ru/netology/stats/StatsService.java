package ru.netology.stats;
import java.util.Arrays;

public class StatsService {

    public long totalSales(long[] sales) {
         return Arrays.stream(sales).sum();
    }

    public long averageSales(long[] sales) {
        long sum = Arrays.stream(sales).sum();
        return sum / sales.length;

    }

    public long minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long monthsBelowAverage(long[] sales) {
        long sum = Arrays.stream(sales).sum();
        long averageSalesInMonth = sum / sales.length;
        long counter = 0;
        for (int i = 0; i < sales.length; i++) {
            if (averageSalesInMonth > sales[i]) {
                counter = counter + 1;
            }
        }
        return  counter;
    }

    public long monthsAboveAverage(long[] sales) {
        long sum = Arrays.stream(sales).sum();
        long averageSalesInMonth = sum / sales.length;
        long counter = 0;
        for (int i = 0; i < sales.length; i++) {
            if (averageSalesInMonth < sales[i]) {
                counter = counter + 1;
            }
        }
        return  counter;
    }

}
