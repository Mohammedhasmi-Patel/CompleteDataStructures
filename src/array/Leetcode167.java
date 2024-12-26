package array;

public class Leetcode167 {

        public int[] twoSum(int[] numbers, int target) {
            int first = 0;
            int last = numbers.length-1;

            while(first<=last){
                if(numbers[first]+numbers[last]==target){
                    return new int[]{first+1,last+1};
                }
                else if(numbers[first]+numbers[last]>target){
                    last--;
                }
                else{
                    first++;
                }
            }
            return new int[] {-1,-1};
        }
    }

