package ru.netology.stats;

public class StatsService {
    public long sumOfAllSales(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long avgSalesPerMonth(long[] purchases) {
        int month = 0;
        for (long purchase : purchases) {
            month += 1;
        }
        return sumOfAllSales(purchases) / month;
    }

    public long lastMaxSalesMonth(long[] purchases) {
        int month = 0;
        int lastMaxMonth = month;
        long lastMaxPurchase = purchases[0];
        for (long purchase : purchases) {
            month += 1;
            if (lastMaxPurchase <= purchase) {
                lastMaxPurchase = purchase;
                lastMaxMonth = month;
            }
        }
        return lastMaxMonth;
    }

    public long lastMinSalesMonth(long[] purchases) {
        int month = 0;
        int lastMinMonth = month;
        long lastMinPurchase = purchases[0];
        for (long purchase : purchases) {
            month += 1;
            if (lastMinPurchase >= purchase) {
                lastMinPurchase = purchase;
                lastMinMonth = month;
            }
        }
        return lastMinMonth;
    }

    public long aboveAvgMonthSales(long[] purchases) {
        int aboveAvgMonth = 0;
        long avgSalesPerMonth = avgSalesPerMonth(purchases);
        for (long purchase : purchases) {
            if (avgSalesPerMonth < purchase) {
                aboveAvgMonth += 1;
            }
        }
        return aboveAvgMonth;
    }

    public long belowAvgMonthSales(long[] purchases) {
        int belowAvgMonth = 0;
        long avgSalesPerMonth = avgSalesPerMonth(purchases);
        for (long purchase : purchases) {
            if (avgSalesPerMonth > purchase) {
                belowAvgMonth += 1;
            }
        }
        return belowAvgMonth;
    }
}
