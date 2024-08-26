import org.junit.Test;

import java.util.List;

public class TestShuangZhiZhen {
    ShuangZhiZhen code = new ShuangZhiZhen();

    @Test
    public void fourSumTest() {
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;
        List<List<Integer>> res = code.fourSum(nums, target);
        System.out.println(res);
    }
}
