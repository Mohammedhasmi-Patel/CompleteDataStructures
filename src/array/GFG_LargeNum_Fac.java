package array;
import java.util.*;

public class GFG_LargeNum_Fac {
    public static void reverseList(ArrayList<Integer>ans){
        int start = 0;
        int end = ans.size()-1;
        int temp = -1;
        while(start<end){
            temp = ans.get(start);
            ans.set(start,ans.get(end));
            ans.set(end,temp);
            start++;
            end--;
        }
    }

    public static ArrayList<Integer> factorial(int n) {

        ArrayList<Integer>ans = new ArrayList<>();

        ans.add(1);
        int carry = 0;

        int i = 2;

        while(i<=n){
            for(int j=0;j<ans.size();j++){
                int product = ans.get(j) * i + carry;
                carry = product /10;
                ans.set(j,product%10);

            }

            while(carry>0){
                ans.add(carry%10);
                carry/=10;
            }
            i++;
        }

        reverseList(ans);

        return ans;

    }
}
