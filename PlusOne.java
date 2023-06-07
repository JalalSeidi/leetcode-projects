public class PlusOne {

    public static void main(String[] args) {
        Solution s = new Solution();
        int arr[] = new int[] { 9, 9, 9, 9 };
        System.out.println("\nAns:- " + Arrays.toString(s.plusOne(arr)));
    }
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.println(String.format("%2d: %d", i, digits[i]));

            if (++digits[i] == 10)
                digits[i] = 0;
            else
                return digits;
        }
        int extra[] = new int[digits.length + 1];
        extra[0] = 1;
        return extra;
    }
}
