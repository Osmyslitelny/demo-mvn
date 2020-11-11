package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MySecondTestNgTest {

    @Test
    public void test_one_success() {
        Assert.assertEquals(42, 42);
    }

    @Test
    public void test_two_fail() {
        Assert.assertEquals(42, 42);
    }

}
