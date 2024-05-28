package goral;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DayCalculatorTest {

    @Test
    public void shouldReturn30For2018_06(){
        //given
        DayCalculator dayCalculator = new DayCalculator();
        dayCalculator.getDatCount2(2018, 6);
        //when
        int dayCount = dayCalculator.getDatCount2(2018,6);
        //then
        Assertions.assertEquals(30, dayCount);
    }

    @Test
    public void shouldReturn31For2018_07(){
        //given
        DayCalculator dayCalculator = new DayCalculator();
        dayCalculator.getDatCount2(2018, 7);
        //when
        int dayCount = dayCalculator.getDatCount2(2018,7);
        //then
        Assertions.assertEquals(31, dayCount);
    }

    @Test
    public void shouldReturn31For2018_08(){
        //given
        DayCalculator dayCalculator = new DayCalculator();
        dayCalculator.getDatCount2(2018, 8);
        //when
        int dayCount = dayCalculator.getDatCount2(2018,8);
        //then
        Assertions.assertEquals(31, dayCount);
    }

    @Test
    public void shouldReturn28For2018_02(){
        //given
        DayCalculator dayCalculator = new DayCalculator();
        dayCalculator.getDatCount2(2018, 2);
        //when
        int dayCount = dayCalculator.getDatCount2(2018,2);
        //then
        Assertions.assertEquals(28, dayCount);
    }

    @Test
    public void shouldReturn29For2016_02(){
        //given
        DayCalculator dayCalculator = new DayCalculator();
        dayCalculator.getDatCount2(2016, 2);
        //when
        int dayCount = dayCalculator.getDatCount2(2016,2);
        //then
        Assertions.assertEquals(29, dayCount);
    }

    @Test
    public void shouldReturn28For2010_02(){
        //given
        DayCalculator dayCalculator = new DayCalculator();
        dayCalculator.getDatCount2(2010, 2);
        //when
        int dayCount = dayCalculator.getDatCount2(2010,2);
        //then
        Assertions.assertEquals(28, dayCount);
    }

    @Test
    public void shouldReturn28For2100_02(){
        //given
        DayCalculator dayCalculator = new DayCalculator();
        dayCalculator.getDatCount2(2100, 2);
        //when
        int dayCount = dayCalculator.getDatCount2(2100,2);
        //then
        Assertions.assertEquals(28, dayCount);
    }

    @Test
    public void shouldReturn29For2000_02(){
        //given
        DayCalculator dayCalculator = new DayCalculator();
        dayCalculator.getDatCount2(2000, 2);
        //when
        int dayCount = dayCalculator.getDatCount2(2000,2);
        //then
        Assertions.assertEquals(29, dayCount);
    }

}