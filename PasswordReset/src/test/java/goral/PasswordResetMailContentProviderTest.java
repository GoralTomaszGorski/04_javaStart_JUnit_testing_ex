package goral;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class PasswordResetMailContentProviderTest {


    @Test
    void shouldPreparePasswordResetEmail() {
        RandomProvider randomProvider = Mockito.mock(RandomProvider.class);
        when(randomProvider.passwordGenerator()).thenReturn("asdfghjkl1234567890");
        PasswordResetMailContentProvider passwordResetMailContentProvider = new PasswordResetMailContentProvider(randomProvider);


        // when
        String resetMailContent = passwordResetMailContentProvider.createResetMailContent();

        // then
        assertThat(resetMailContent).isEqualTo("Cześć, aby przejść do resetowania hasła <a href=\"https://example.com/reset?key=asdfghjkl1234567890\">ten link</a>");
    }

}