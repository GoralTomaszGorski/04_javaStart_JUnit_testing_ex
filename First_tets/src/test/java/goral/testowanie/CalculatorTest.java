package goral.testowanie;

import goral.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void should2to5return7(){

        //given  - przygotowanie danych testowych i środowiska
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 2;

        //when - wykonanie kodu który chcemy przetestować czy działa poprawnie
        int result = calculator.add(a, b);

        //then - sprawdzenie czy wynik jest taki jak się spodziewamy
        Assertions.assertEquals(6, result);
    }

    @Test
    public void should1to1return2(){

        //given
        Calculator calculator = new Calculator();
        int a = 1;
        int b = 1;

        //when
        int result = calculator.add(a, b);

        //then
        Assertions.assertEquals(2, result);
    }
}
