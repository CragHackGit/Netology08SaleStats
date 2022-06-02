package ru.netology.stats;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        StatsService service  = new StatsService();

        long[] salesStatistic = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(Arrays.toString(salesStatistic));

        long totalSales = service.totalSales(salesStatistic);
        System.out.println("Сумма всех продаж: " + totalSales);

        long averageSales = service.averageSales(salesStatistic);
        System.out.println("Средняя сумма продаж в месяц: " + averageSales);

        long maxSalesMonth = service.maxSales(salesStatistic);
        System.out.println("Месяц максимальных продаж: " + maxSalesMonth);

        long minSalesMonth = service.minSales(salesStatistic);
        System.out.println("Месяц минимальных продаж: " + minSalesMonth);

        long monthsBelowAverage = service.monthsBelowAverage(salesStatistic);
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего: " + monthsBelowAverage);

        long monthsAboveAverage = service.monthsAboveAverage(salesStatistic);
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего: " + monthsAboveAverage);

    }
}
