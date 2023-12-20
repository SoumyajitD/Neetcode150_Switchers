import java.util.Arrays;

public class Leetcode1 {
    public static void main(String[] args) {
    int[] n=new int[]{3,2,4};
        System.out.println(Arrays.toString(twoSum(n,6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];

        int c=0;
        int k=1;
        int mx=nums.length;

        for(int x:nums){

            if(x + nums[k] == target){
            ans[0]=c;
            ans[1]=k;
            return ans;

            }

            k++;
            c++;
        }
return ans;
    }
}
