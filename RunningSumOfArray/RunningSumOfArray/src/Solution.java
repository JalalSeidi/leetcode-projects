import java.util.Arrays;

public class Solution {
    public static int[] runningSum(int[] nums) {
        for (int iElement = 1; iElement < nums.length; iElement++) {
            nums[iElement] += nums[iElement - 1];
        }
        return nums;
    }



    public static int[] runningSumCreateCopy(int[] nums) {

        int[] output = new int[nums.length];

        output[0] = nums[0];
        for (int iElement = 1; iElement < nums.length; iElement++) {
            output[iElement] = output[iElement - 1] + nums[iElement];
        }
        return output;
    }
    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        System.out.println("Input Array : "+ Arrays.toString(nums));

        System.out.println("Output Array:");
        System.out.println(Arrays.toString(runningSumCreateCopy(nums)));
        System.out.println(Arrays.toString(runningSum(nums)));

        int[] arr = {1,1,1,1,1};
        System.out.println("\nInput Array : "+Arrays.toString(arr));

        System.out.println("Output Array:");
        System.out.println(Arrays.toString(runningSumCreateCopy(arr)));
        System.out.println(Arrays.toString(runningSum(arr)));

    }
}
