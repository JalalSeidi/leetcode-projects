public class Solution {

    public static int longestOnes(int[] nums, int k) {
        int windowStart = 0, windowEnd = 0, max_number = Integer.MIN_VALUE;

        int zeroes_counter = 0;

        boolean isExtraFound = false;

        while(windowEnd < nums.length)
        {
            if(nums[windowEnd] == 0 && !isExtraFound)
                zeroes_counter++;

            if(zeroes_counter <= k)
            {
                windowEnd++;
                isExtraFound = false;
            }

            else
            {
                max_number = Math.max(max_number, windowEnd - windowStart);

                if(nums[windowStart] == 0)
                    zeroes_counter--;
                windowStart++;

                isExtraFound = true;
            }
        }

        max_number = Math.max(max_number, windowEnd - windowStart);


        return max_number;
    }

    public static void main(String[] args) {
        int [] arr1 = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        System.out.println("\nMaxCapacity: " + longestOnes(arr1,k));    }
}
