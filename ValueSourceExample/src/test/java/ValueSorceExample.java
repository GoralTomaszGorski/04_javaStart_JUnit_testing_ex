import goral.EmailValidator;
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
}
