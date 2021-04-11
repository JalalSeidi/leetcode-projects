package Learning.company;

public class RunningSumOf1dArray {

    public int[] runningSum(int[] nums) {
      int[] result = new int[nums.length];
      int temp = 0;
      for (int i = 0;i < nums.length; i++) {
          temp = nums[i] + temp;
          result[i] = temp;
      }
      return result;
    }
}
