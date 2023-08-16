import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void maxSlidingWindowTest1() {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] expected = {3, 3, 5, 5, 6, 7};
        int[] actual = new Solution().maxSlidingWindow(nums, k);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void maxSlidingWindowTest2() {
        int[] nums = {1};
        int k = 1;
        int[] expected = {1};
        int[] actual = new Solution().maxSlidingWindow(nums, k);

        Assert.assertArrayEquals(expected, actual);
    }
}
