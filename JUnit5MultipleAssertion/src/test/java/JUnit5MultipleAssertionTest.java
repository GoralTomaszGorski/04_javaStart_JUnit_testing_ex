import goral.Superhero;
import goral.Superheros;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class JUnit5MultipleAssertionTest {

    @Test
    void shouldCorrectlyCreateHulk() {

        //when
        Superhero hulk = Superheros.getHulk();

        //that
        assertThat(hulk.getAbilities()).contains("intelligence");
        assertThat(hulk.getColor()).isEqualTo("blue");
        assertThat(hulk.getPublisher()).isEqualTo("Disney");
    }

    @Test
    void multipleAssertionsTogetherWithAssertJ(){
        Superhero hulk = Superheros.getHulk();
        assertAll(
                () -> assertThat(hulk.getAbilities()).contains("intelligence"),
                () -> assertThat(hulk.getColor()).isEqualTo("blue"),
                () -> assertThat(hulk.getPublisher()).isEqualTo("Disney")
        );
    }

    //OK
    @Test
    void multipleAssertionsTogetherWithAssertJBetter(){
        Superhero hulk = Superheros.getHulk();
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(hulk.getAbilities()).contains("intelligence");
        softAssertions.assertThat(hulk.getColor()).isEqualTo("blue");
        softAssertions.assertThat(hulk.getPublisher()).isEqualTo("Disney");
        softAssertions.assertAll();

    }
}
