package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        RunningSumOf1dArray runningSumOf1dArray = new RunningSumOf1dArray();
        int[] nums = {1,2,3,4};
        int[] result = runningSumOf1dArray.runningSum(nums);
        System.out.println(Arrays.toString(result));
    }
}
