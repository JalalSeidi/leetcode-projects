public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int capacity = 0;

        for (int x = 0; x < height.length; x++) {
            for (int k = x + 1; k < height.length; k++) {
                capacity = Math.max(capacity, Math.min(height[x], height[k]) * (k - x));
            }
        }
        return capacity;
    }

    // main Method
    public static void main(String[] args) {
        int arr1[] = {
                1,
                5,
                4,
                3,
                1
        };
        int arr2[] = {
                3,
                1,
                2,
                4,
                5,
                1
        };

        System.out.println("\nMaxCapacity: " + maxArea(arr1));
        System.out.println("\n\nMaxCapacity: " + maxArea(arr2));

    }
}
