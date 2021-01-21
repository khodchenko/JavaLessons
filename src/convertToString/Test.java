package convertToString;

import static org.junit.Assert.assertEquals;

public class Test {


    public class NumberStringExampleTests {

        public void tests() {
            assertEquals("67", Kata.numberToString(67));
            assertEquals("123", Kata.numberToString(123));
            assertEquals("999", Kata.numberToString(999));
        }
    }
}
