import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SineCalculatingTest {
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

    @Test
    public void testSineValueAtPiDivideByTwo() {
        Assert.assertEquals(1, sineCalculating.calculateSineOfNumber(Math.PI / 2), DELTA);
    }

    @Test
    public void testSineValueAtNull() {
        Assert.assertEquals(0, sineCalculating.calculateSineOfNumber(0), DELTA);
    }

    @Test
    public void testSineValueAtMultiplyByTwo() {
        Assert.assertEquals(-2.44929e-16, sineCalculating.calculateSineOfNumber(Math.PI * 2), DELTA);
    }
}
