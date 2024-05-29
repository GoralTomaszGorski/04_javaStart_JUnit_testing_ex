package goral;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JUnit5AssertionsTest {
    //given
    private JUnit5Assertions sut = new JUnit5Assertions();


    @Test
    void shouldByPrimeFor1() {

        //when
        boolean result = sut.isPrimeNumber(1);

        //then
        Assertions.assertTrue(result);
    }
    @Test
    void shouldByPrimeFor2() {

        //when
        boolean result = sut.isPrimeNumber(2);

        //then
        Assertions.assertTrue(result);
    }
    @Test
    void shouldByPrimeFor10() {

        //when
        boolean result = sut.isPrimeNumber(10);

        //then
        Assertions.assertFalse(result);
    }
    @Test
    void shouldByPrimeFor13() {

        //when
        boolean result = sut.isPrimeNumber(13);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldReturnValidCode() {

        //when
        JUnit5Assertions.Code code = sut.getCode("a");

        //then
        Assertions.assertEquals("a", code.getKey());
        Assertions.assertNotNull(code.getKey());
        Assertions.assertNotNull(code.getCreatedAtTimestamp());
    }

    @Test
    public void shouldReturnSameCode() {

        //when
        JUnit5Assertions.Code code = sut.getCode("a");
        JUnit5Assertions.Code code2 = sut.getCode("a");

        //then
        Assertions.assertSame(code, code2);

    }

    @Test
    public void shouldReturnDifferentCode() {


        //when
        JUnit5Assertions.Code code = sut.getCode("a");
        JUnit5Assertions.Code code2 = sut.getCode("b");

        //then
        Assertions.assertNotSame(code, code2);
    }
}