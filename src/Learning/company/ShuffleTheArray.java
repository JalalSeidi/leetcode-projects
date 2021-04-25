package Learning.company;

public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int x = 0;
        int y = n;

        int[] shuffledArray = new int[nums.length];
        for (int i = 0; i < nums.length; i = i + 2) {
            shuffledArray[i] = nums[x++];
            shuffledArray[i + 1] = nums[y++];
        }
        return shuffledArray;
    }
}
