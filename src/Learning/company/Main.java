package Learning.company;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
//        TwoSumSolution twoSumSolution = new TwoSumSolution();
//        Scanner keyboard = new Scanner(System.in);
//
//        System.out.println("Enter the length of array");
//        int n = keyboard.nextInt();
//        int[] nums = new int[n];
//
//        System.out.println("Enter the " + n + " numbers in your array ");
//        for (int i = 0; i < n; i++) {
//            nums[i] = keyboard.nextInt();
//        }
//        System.out.println("Enter the sum of the two numbers in the array");
//        int target = keyboard.nextInt();
//
//        int[] result = twoSumSolution.twoSum(nums, target);
//
//        if (result != null) {
//            System.out.println(result[0] + " " + result[1]);
//        } else {
//            System.out.println("No solution found!");
//        }
//
//        AddTwoNumbersSolution addTwoNumbersSolution = new AddTwoNumbersSolution();
//        LinkedList<Integer> myHatredList = new LinkedList<>();
//        myHatredList.add(0, 2);
//        myHatredList.add(1, 4);
//        myHatredList.add(2, 3);
//        LinkedList<Integer> myDearList = new LinkedList<Integer>();
//        myDearList.add(0, 5);
//        myDearList.add(1, 6);
//        myDearList.add(2, 4);
//
//        addTwoNumbersSolution.reverseLinkedList(myDearList);
//        int reversedFirstNumber = addTwoNumbersSolution.getLinkedListInNumber(myDearList);
//        addTwoNumbersSolution.reverseLinkedList(myHatredList);
//        int reversedSecondNumber = addTwoNumbersSolution.getLinkedListInNumber(myHatredList);
//
//        int sum = addTwoNumbersSolution.sum(reversedFirstNumber, reversedSecondNumber);
//
//        int reversedSum = addTwoNumbersSolution.reversedInteger(sum);
//
//        String[] numberToLinkedList = addTwoNumbersSolution.integerToStrArray(reversedSum);
//
//        LinkedList<String> answer = addTwoNumbersSolution.strArrayToLinkedList(numberToLinkedList);
//
//        System.out.println("The first reversed number = " + reversedFirstNumber);
//        System.out.println("The second reversed number = " + reversedSecondNumber);
//        System.out.println("The sum of two reversed number = " + sum);
//        System.out.println("The reverse of the sum = " + reversedSum);
//        System.out.println("The converted sum to linkedlist = " + answer);
//        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
//        lengthOfLongestSubstring.lengthOfLongestSubstring("abcdeffgghjk");

//        Exercise RunningSumOf1DArray
//        RunningSumOf1dArray runningSumOf1dArray = new RunningSumOf1dArray();
//        int[] nums = {1,2,3,4};
//        int[] result = runningSumOf1dArray.runningSum(nums);
//        System.out.println(Arrays.toString(result));

//        Exercise ShuffleTheArray
        ShuffleTheArray shuffleTheArray = new ShuffleTheArray();
        int[] shuffle = {1,2,4,5,6,7};
        int[] result = shuffleTheArray.shuffle(shuffle, 3);
        for (int element : result ) {
//            int element will be defined as one element of result.
            System.out.print(element);
        }
    }
}


