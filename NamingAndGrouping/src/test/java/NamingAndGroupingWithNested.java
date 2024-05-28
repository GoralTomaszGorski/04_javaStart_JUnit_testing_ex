import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NamingAndGroupingWithNested {

    @Nested
    class Calculations {
        @DisplayName("Should add 2 to 5 return 5, 2+3=5 ")
        @Test
        public void shouldAdd2to3AndReturn5() {
        }

        @Nested
        class Complicated {
            @DisplayName("Should add 1 to 1 return 2")
            @Test
            public void shouldAdd2to3AndReturn5() {
            }
        }
    }

    @DisplayName("mail tests")
    @Nested
    class Mails{
        @DisplayName("Should send email olny to subscribers")
        @Test
        public void shouldSendEmailOnlyToSubscribers() {
        }
    }

    @DisplayName("Should remove cache after invalidate")
    @Test
    public void shouldRemoveCacheAfterInvalidate() {
    }
}
