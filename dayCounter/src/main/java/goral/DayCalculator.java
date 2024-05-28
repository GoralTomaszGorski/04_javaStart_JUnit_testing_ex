package goral;

import java.time.YearMonth;


public class DayCalculator {

    public int getDayCount(int year, int month) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            default -> (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? 29 : 28;
        };
    }

    int getDatCount2(int year, int month){
        return YearMonth.of(year, month).lengthOfMonth();
    }
}
