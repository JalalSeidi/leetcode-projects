package Learning.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class AddTwoNumbersSolution {

    public void reverseLinkedList(LinkedList<Integer> list) {
        Collections.reverse(list);
    }

    public int getLinkedListInNumber(LinkedList<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        String elements = "";
        while (iterator.hasNext()) {
            elements += iterator.next().toString();
        }
        return Integer.parseInt(elements);
    }

    public int sum(int num1, int num2) {
        int addedNumbers = num1 + num2;
        return addedNumbers;
    }

    public int reversedInteger(int originNumber) {
        int reversedNumber = 0;
        while (originNumber != 0) {
            int digit = originNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            originNumber /= 10;
        }
        return reversedNumber;
    }

    public String[] integerToStrArray(int originNumber) {
        int j = 0;
        int len = Integer.toString(originNumber).length();
        int[] arr = new int[len];
        while (originNumber != 0) {
            arr[len - j - 1] = originNumber % 10;
            originNumber = originNumber / 10;
            j++;
        }
        String strArray[] = new String[arr.length];
        for (int i = 0; i < arr.length; i++)
            strArray[i] = String.valueOf(arr[i]);
        return strArray;
    }

    public LinkedList<String> strArrayToLinkedList(String[] strLinkedList){
        LinkedList<String> linkedList = new LinkedList<String>();
        Collections.addAll(linkedList, strLinkedList);
        return linkedList;
    }
}
