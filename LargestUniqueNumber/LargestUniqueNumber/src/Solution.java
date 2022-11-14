import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int largestUniqueNumber(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int a : A)
        {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        int res = -1;
        for (int a : A) {
            if (map.get(a) == 1 && a > res) res = a;
        }
        return res;
    }

    public static void main(String[] args) {
        int [] arr = {5,7,3,9,4,9,8,3,1};
        System.out.println(largestUniqueNumber(arr));
    }
}
