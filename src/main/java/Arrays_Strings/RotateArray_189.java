package Arrays_Strings;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
//Input: nums = [1,2,3,4,5,6,7], k = 3
//              [7,6,5,4,3,2,1]
//              [5,6,7,4,3,2,1]
//              [5,6,7,1,2,3,4]


//        Output: [5,6,7,1,2,3,4]
public class RotateArray_189 {
    public void rotate(int[] nums, int k) {
        // Обработка случая, когда k превышает длину массива
        k = k % nums.length;

        // Переворачиваем весь массив
        reverse(nums, 0, nums.length-1);

        // Переворачиваем первые k элементов
        reverse(nums, 0, k-1);

        // Переворачиваем оставшиеся элементы
        reverse(nums, k, nums.length-1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}


//Analogue #2
//public void rotate(int[] nums, int k) {
//    LinkedList<Integer> list = new LinkedList<>();
//    for(int num : nums) {
//        list.add(num);
//    }
//    for(int i = 0; i < k; i++) {
//        int last = list.getLast();
//        list.removeLast();
//        list.addFirst(last);
//    }
//    for (int i = 0; i < nums.length; i++) {
//        nums[i] = list.get(i);
//    }
//}