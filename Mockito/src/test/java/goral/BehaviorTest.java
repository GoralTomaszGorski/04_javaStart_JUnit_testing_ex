package goral;

import goral.argumentmatcher.User;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;

public class BehaviorTest {

    @Test
    public void shouldAlwaysReturnGivenName(){
        User user = Mockito.mock(User.class);

        Mockito.when(user.getName()).thenReturn("Kasia");

        assertThat(user.getName()).isEqualTo("Kasia");
        assertThat(user.getName()).isEqualTo("Kasia");
        assertThat(user.getName()).isEqualTo("Kasia");
    }

    @Test
    public void testMockitoWhenValues(){
        User user = Mockito.mock(User.class);

        Mockito.when(user.getName()).thenReturn("Kasia", "Basia", "Krysia", "Tomek");
        assertThat(user.getName()).isEqualTo("Kasia");
        assertThat(user.getName()).isEqualTo("Basia");
        assertThat(user.getName()).isEqualTo("Krysia");
        assertThat(user.getName()).isEqualTo("Tomek");
    }

    @Test
    public void shouldAlwaysReturnGiven(){
        User user = Mockito.mock(User.class);

        Mockito.when(user.getName()).then(
                invocationOnMock -> {
                    System.out.println("Liczenie wartości wynikowej");
                    return "Kasia";
                });

        System.out.println("Zaraz będę sprawdzał po raz #1");
        assertThat(user.getName()).isEqualTo("Kasia");
        System.out.println("Zaraz będę sprawdzał po raz #2");
        assertThat(user.getName()).isEqualTo("Kasia");
        System.out.println("Zaraz będę sprawdzał po raz #3");
        assertThat(user.getName()).isEqualTo("Kasia");
    }

    @Test
    public void shouldThrowExceptionOnSetter(){
        User user = Mockito.mock(User.class);

        Mockito.doThrow(new IllegalStateException()).when(user).setName("Kasia");

        user.setName("Basia");
    }
}
