/**
 * @author @Euraks 25.10.2022
 */
package first_part;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums){
        int[] rezarray = new int[nums.length];
        int sum=0;
            for (int i = 0;i<nums.length;i++){
                sum = nums[i]+sum;
                rezarray[i]=sum;
            }
        return rezarray;
    }

}
