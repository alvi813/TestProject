import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SineValueAtMultiplyByTwoTest {
    private final double DELTA = 1e-16;
    private static SineCalculating sineCalculating;

    @BeforeClass
    public static void createNewSineCalculating() {
        sineCalculating = new SineCalculating();
    }

    @Test
    public void testSineValueAtMultiplyByTwo() {
        Assert.assertEquals(-2.44929e-16, sineCalculating.calculateSineOfNumber(Math.PI * 2), DELTA);
    }
}
