import goral.EmailProviderType;
import goral.EmailValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class MethodSourceExample {

    @ParameterizedTest
    @MethodSource("provideTestData")
    void shouldProperlyRecognizeEmailProvider(String domain, EmailProviderType expectedProviderType){

        //given
        EmailValidator emailValidator = new EmailValidator();

        //when
        EmailProviderType providerType = emailValidator.determineProviderType(domain);

        // then
        assertThat(providerType).isEqualTo(expectedProviderType);
    }

    private static List<Arguments> provideTestData(){
        return List.of(
                Arguments.of("gmail.com", EmailProviderType.PROVIDER),
                Arguments.of("trash-mail.com", EmailProviderType.TRASHMAIL),
                Arguments.of("outlook.com", EmailProviderType.PROVIDER),
                Arguments.of("kowalski.pl", EmailProviderType.PRIVATE)
        );
    }
}
