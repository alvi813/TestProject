import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SineValueAtPiDivideByTwoTest {
    private final double DELTA = 1e-16;
    private static SineCalculating sineCalculating;

    @BeforeClass
    public static void createNewSineCalculating() {
        sineCalculating = new SineCalculating();
    }

    @Test
    public void testSineValueAtPiDivideByTwo() {
        Assert.assertEquals(1, sineCalculating.calculateSineOfNumber(Math.PI / 2), DELTA);
    }
}
