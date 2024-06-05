import goral.EmailProviderType;
import goral.EmailValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CsvSourceExample {

    @ParameterizedTest
    @CsvSource({"gmail.com, PROVIDER",
            "outlook.com, PROVIDER",
            "trash-mail.com, TRASHMAIL",
            "byom.de, TRASHMAIL",
            "kowalski.com, PRIVATE"})
    void shouldProperlyRecognizeEmailProvider(String domain, EmailProviderType expectedProviderType){

        //given
        EmailValidator emailValidator = new EmailValidator();

        //when
        EmailProviderType providerType = emailValidator.determineProviderType(domain);

        // then
        assertThat(providerType).isEqualTo(expectedProviderType);
    }
}
