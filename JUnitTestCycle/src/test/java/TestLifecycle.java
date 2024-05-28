import org.junit.jupiter.api.*;

public class TestLifecycle {

    private static int counterBeforeAll;
    private int counter;

    @BeforeEach
    public void initBeforeEach() {
        System.out.println("Wykonuje BeforeEach przed każdym testem");
        counter = 0;
    }

    @AfterEach
    public void initAfterEach() {
        System.out.println("Wykonuje AfterEach po każdym teście");
        counter = 0;
    }

    @BeforeAll
    public static void initBeforeAll() {
        System.out.println("Wykonuje BeforeAll przed wszystkimi testami");
        counterBeforeAll = 0;
    }

    @AfterAll
    public static void initAfterAll() {
        System.out.println("Wykonuje AfterAll po wszystkich testach");
    }



    @Test
    public void test1() {
        System.out.println("Wykonuje test 1. Licznik to: " + counter);
        counter = 1;
    }

    @Test
    public void test2() {
        System.out.println("Wykonuje test 2. Licznik to: " + counter);
        counter = 2;
    }

    @Test
    public void test3() {
        System.out.println("Wykonuje test 3. Licznik to: " + counter);
        counter = 3;
    }

}
