package array;
import java.util.*;

public class Leetcode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        if (n < 3) {
            return ans;
        }
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            // avoiding duplicate as an fix value
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int fixValue = nums[i];
            int start = i + 1;
            int end = n - 1;


            while (start < end) {
                if (nums[start] + nums[end] > (-fixValue)) {
                    end--;
                } else if (nums[start] + nums[end] < (-fixValue)) {
                    start++;
                } else if(nums[start] + nums[end]==(-fixValue)) { // equal
                    // remove duplicate first
                    while (start < end && nums[start] == nums[start + 1]) start++;
                    while (start < end && nums[end] == nums[end - 1]) end--;

                    List<Integer> st = new ArrayList<>();
                    st.add(fixValue);
                    st.add(nums[start]);
                    st.add(nums[end]);

                    ans.add(st);
                    start++;
                    end--;
                }
            }
        }
        return ans;
    }
}