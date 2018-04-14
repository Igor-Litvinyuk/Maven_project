import static org.junit.Assert.*;

public class NumbersTest {

    @org.junit.Test
    public void sum() {
        Numbers numbers = new Numbers();
        int actual = numbers.sum(100);
        int expected = 4950;
        assertEquals(actual, expected);
    }
}