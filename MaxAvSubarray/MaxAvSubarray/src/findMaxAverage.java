public class findMaxAverage {
    public double findMaxAverage(int[] nums, int k) {

        double l = Integer.MAX_VALUE, r = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            l = Math.min(l, nums[i]);
            r = Math.max(r, nums[i]);
        }

        while(r - l > 1e-6){
            double mid = (l + r) / 2.0;

            if(isSmallMid(nums, mid, k)){
                l = mid;
            }else{
                r = mid;
            }
        }

        return l;
    }

    private boolean isSmallMid(int[] nums, double mid, int k){
        int len = nums.length;
        double[] sum = new double[len + 1];
        double minPre = 0;

        for(int i = 1; i < len + 1; i++){
            sum[i] = sum[i - 1] + nums[i - 1] - mid;
            if(i >= k && sum[i] - minPre >= 0){
                return true;
            }

            if(i >= k){
                minPre = Math.min(minPre, sum[i - k + 1]);
            }
        }

        return false;
    }
}
