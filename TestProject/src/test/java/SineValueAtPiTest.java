import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SineValueAtPiTest {
    private final double DELTA = 1e-16;
    private static SineCalculating sineCalculating;

    @BeforeClass
    public static void createNewSineCalculating() {
        sineCalculating = new SineCalculating();
    }


    @Test
    public void testSineValueAtPi() {
        //Assert.assertEquals(1.22515e-16, Math.sin(Math.PI), DELTA);
        Assert.assertEquals(1.22465e-16, sineCalculating.calculateSineOfNumber(Math.PI), DELTA);
    }
}
