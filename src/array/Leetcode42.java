package array;

public class Leetcode42 {
    // by applying this concept the time complexity goes two O(n*n) in worst case condition
    static int trap(int [] height){
        int n = height.length;
        int totalWater = 0;
        for(int i=0;i<n;i++){
            if(i==0 || i==n-1){
                continue;
            }

            int j = i - 1;
            int leftMaxi = height[i];
            // left greatest value
            while(j>=0){
                leftMaxi = Math.max(height[j],leftMaxi);
                j--;
            }

            int k = i + 1;
            int rightMaxi = height[i];


            while(k<n){
                rightMaxi = Math.max(rightMaxi,height[k]);
                k++;
            }

            int currentHeight = Math.min(leftMaxi,rightMaxi)-height[i];
            // actually width is constant which is 1 so we don't need to increase one extra operation
            totalWater += currentHeight;

        }
        return totalWater;
    }

    public static void main(String[] args) {

    }
}
