package goral;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DayCountTest {


    @Test
    public void shouldReturn30For2018_06(){
        //given
        DayCalculator dayCalculator = new DayCalculator();
        dayCalculator.getDayCount(2018, 6);
        //when
        int dayCount = dayCalculator.getDayCount(2018,6);
        //then
        Assertions.assertEquals(30, dayCalculator);
    }
/*
    rok: 2018, miesiąc: 06 ma dać wynik 30
    rok: 2018, miesiąc: 07 ma dać wynik 31
    rok: 2018, miesiąc: 08 ma dać wynik 31
    rok: 2018, miesiąc: 02 ma dać wynik 28
    rok: 2016, miesiąc: 02 ma dać wynik 29
    rok: 2010, miesiąc: 02 ma dać wynik 28
    rok: 2100, miesiąc: 02 ma dać wynik 28 - podzielny przez 100, ale niepodzielny przez 400 - NIE jest to więc rok przestępny
    rok: 2000, miesiąc: 02 ma dać wynik 29 - podzielny przez 100 oraz przez 400 - jest to więc rok przestępny
*/



}