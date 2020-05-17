import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SineValueAtNullTest {
    private final double DELTA = 1e-16;
    private static SineCalculating sineCalculating;

    @BeforeClass
    public static void createNewSineCalculating() {
        sineCalculating = new SineCalculating();
    }

    @Test
    public void testSineValueAtNull() {
        Assert.assertEquals(0, sineCalculating.calculateSineOfNumber(0), DELTA);
    }
}
