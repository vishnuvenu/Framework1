import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass1 {
    @Test
    public void test1() {
        Assert.assertTrue(true);
    }
    @Test
    public void test2() {
        Assert.assertTrue(true);
    }
    @Test
    public void test3() {
        Assert.assertTrue(false);
    }
}
