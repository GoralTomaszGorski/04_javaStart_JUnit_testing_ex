package goral;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CounterService {

    DateToCount dateToCount;

    public CounterService(DateToCount dateToCount) {
        this.dateToCount = dateToCount;
    }

    int getDayCount(int year,  int month){
        year = dateToCount.getMonth();
        month = dateToCount.getYear();

        return year;
    }
}
