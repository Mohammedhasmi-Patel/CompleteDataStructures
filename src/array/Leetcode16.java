package array;
import java.util.*;
public class Leetcode16 {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int closeSum = nums[0]+nums[1]+nums[2];

        for(int i=0;i<n;i++){
            int start = i + 1;
            int end = n-1;

            while(start<end){
                int sum = nums[start]+nums[end]+nums[i];

                if(Math.abs(target-sum)<Math.abs(target-closeSum)){
                    closeSum = sum;
                }

                // check value of summ

                if(sum<target){
                    start++;
                }else if(sum>target){
                    end--;
                }else{
                    return sum;
                }
            }
        }

        return closeSum;

    }
}
