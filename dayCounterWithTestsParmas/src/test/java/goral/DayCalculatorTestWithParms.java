package goral;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class DayCalculatorTestWithParms {


    //given
    private DayCalculator dayCalculator = new DayCalculator();


    @DisplayName("check how many days has 06.2018, 06.2024")
    @ParameterizedTest
    @CsvSource({"1988, 6",
    "2024, 6"})
    public void shouldReturn30Days(int year, int month){
        //when
        int dayCount = dayCalculator.getDayCount(year, month);
        //then
        assertThat(dayCount).isEqualTo(30);
    }

    @DisplayName("check how many days has 07.2024, 08.2024")
    @ParameterizedTest
    @CsvSource({"2024, 7",
    "2024, 8"})
    public void shouldReturn31Days(int year, int month){
        //when
        int dayCount = dayCalculator.getDayCount(year, month);
        //then
        assertThat(dayCount).isEqualTo(31);
    }

}