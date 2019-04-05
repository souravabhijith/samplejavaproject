import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aravuri on 23/03/19.
 */
public class BTest {

    @Test
    public void testBDiff() {
        B b = new B(new A());
        Assert.assertEquals(5, b.diff(6, 1));
    }

    @Test
    public void testBFail() {
        Assert.assertEquals("6 should be 7", 6,7);
    }
}
