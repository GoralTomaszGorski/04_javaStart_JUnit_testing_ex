package goral;

import goral.argumentmatcher.User;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ArgumentMatcherMultipleParamslTest {

    @Test
    public void shouldSendEmailOnlyToAdmin(){

        //given
        EmailService emailService = mock(EmailService.class);

        //when
        when(emailService.prepareEmailContentFormatting(eq("Tresc maila"), anyBoolean())).thenReturn("<b>Tresc maila</>"); //1

    }

    @Test
    public void shouldSendEmailOnlyToAdminWithAny() {

      //given
      EmailService emailService = mock(EmailService.class);

      //when
        when(emailService.prepareEmailContentFormatting(any(), anyBoolean())).thenReturn("Treść maila");
    }

    @Test
    public void shouldHandleVoidMethod() {
        User user = Mockito.mock(User.class);

        Mockito.doThrow(new IllegalStateException()).when(user).setName(ArgumentMatchers.anyString());

    }

}