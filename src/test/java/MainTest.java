import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void assertTrue() {
        assertEquals(1, 1);
    }

    @Test
    public void assertFalse() {
        assertEquals(1, 2);
    }
}
