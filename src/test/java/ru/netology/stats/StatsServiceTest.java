package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void sumOfAllSales() {
        long expected = 180;
        StatsService service = new StatsService();
        long actual = service.sumOfAllSales(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void avgSalesPerMonth() {
        long expected = 15;
        StatsService service = new StatsService();
        long actual = service.avgSalesPerMonth(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void lastMaxSalesMonth() {
        long expected = 8;
        StatsService service = new StatsService();
        long actual = service.lastMaxSalesMonth(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void lastMinSalesMonth() {
        long expected = 9;
        StatsService service = new StatsService();
        long actual = service.lastMinSalesMonth(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void aboveAvgMonthSales() {
        long expected = 5;
        StatsService service = new StatsService();
        long actual = service.aboveAvgMonthSales(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void belowAvgMonthSales() {
        long expected = 5;
        StatsService service = new StatsService();
        long actual = service.belowAvgMonthSales(purchases);
        assertEquals(expected, actual);
    }
}
