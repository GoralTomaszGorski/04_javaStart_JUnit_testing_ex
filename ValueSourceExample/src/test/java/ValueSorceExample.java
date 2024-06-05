import goral.EmailValidator;
import goral.FibonacciGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;


public class ValueSorceExample {

    @ParameterizedTest
    @ValueSource(strings = {"example@example.com", "a@a.pl", "a@domena.com.pl", "a123@onion", "asWQ"})
    void shouldBeValid(String email){

            // given
            EmailValidator emailValidator = new EmailValidator();

            // when
            boolean isValid = emailValidator.isValid(email);

            // then
            assertThat(isValid).isEqualTo(true);
    }

    @ParameterizedTest
    @ValueSource(ints ={1, 2, 3, 5, 8, 13})
    void shouldBeFibonacciNumber(int number){

        // given
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();

        // when
        boolean isFibonacci = fibonacciGenerator.checkIfFibonacciNumber(number);

        //then
        assertThat(isFibonacci).isTrue();

    }

    @DisplayName("Should be Fibonacci number ")
    @ParameterizedTest(name = "{arguments} should be a Fibonacci number")
    @ValueSource(ints ={1, 2, 3, 5, 8, 13})
    void shouldBeFibonacciNumberWithPrettyName(int number){

        // given
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();

        // when
        boolean isFibonacci = fibonacciGenerator.checkIfFibonacciNumber(number);

        //then
        assertThat(isFibonacci).isTrue();

    }
}
