package goral.argumentmatcher;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.mockito.ArgumentMatcher;



import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ArgumentMatcherTest {



    @Test
    public void shouldHandleVoidMethod(){
        User user = mock(User.class);

        Mockito.doThrow(new IllegalStateException()).when(user).setName("Agata");

        user.setName("Basia");
        user.setName("Kasia");
    }

    @Test
    public void shouldHandleVoidMethodAlways(){
        User user = mock(User.class);

        Mockito.doThrow(new IllegalStateException()).when(user).setName(ArgumentMatchers.anyString());

        user.setName("Basia");
        user.setName("Kasia");
    }
}
