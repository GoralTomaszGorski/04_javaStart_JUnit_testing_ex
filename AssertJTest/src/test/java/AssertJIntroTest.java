import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertJIntroTest {
    String name = "Dorota";
    String name2 = "Ewa";

    @Test
    public void shouldEndWithA(){
        org.assertj.core.api.Assertions.assertThat(name).endsWith("a");
        org.assertj.core.api.Assertions.assertThat(name2).endsWith("a");
    }
    @Test
    public void shouldBeDifferent(){
        org.assertj.core.api.Assertions.assertThat(name)
                .isNotEqualTo(name2)
                .endsWith("a")
                .hasSize(6);
    }
}
