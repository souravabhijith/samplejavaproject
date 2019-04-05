import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aravuri on 23/03/19.
 */
public class ATest {

    @Test
    public void testASum() {
        A a = new A();
        Assert.assertEquals(11, a.sum(5, 6));
    }
    @Test
    public void testAfirstN() {
        Assert.assertEquals("5 should be 7", 5,7);
    }
}
