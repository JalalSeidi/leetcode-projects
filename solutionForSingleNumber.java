import java.util.Arrays;

public class solutionForSingleNumber {

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int prev = 0;
        for(int i = 2; i < n; i += 2)
        {
            if(nums[prev] != nums[i])
                return nums[prev];
            else
            {
                i++;
                prev = i;
            }
        }

        return nums[n - 1];
    }
    public static void main(String[] args) {
        int [] myArray = {2,2,3,2};
        System.out.println(singleNumber(myArray));
    }
}
