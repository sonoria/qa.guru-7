import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FirstTest {

    @Test
    void PositiveTest() {
        int a = 2;
        int b = 3;

        assertEquals(a * b, 6);
    }

    @Test
    void NegativeTest() {
        int a = 2;
        int b = 3;

        assertEquals(a * b, 7, "a * b should be 6");
    }
}
