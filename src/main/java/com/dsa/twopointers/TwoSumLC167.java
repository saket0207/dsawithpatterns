package com.dsa.twopointers;

public class TwoSumLC167 {

    public static void main(String[] args) {
        TwoSumLC167 twoSum = new TwoSumLC167();
        int [] numbers = {2,7,11,15};
        int target = 9;
        int [] result = twoSum.twoSum(numbers, target);
        System.out.printf("Result %d %d", result[0], result[1]);
    }

    public int[] twoSum(int[] numbers, int target) {
        //array is sorted/ asked to find pair(like here), triplet, etc / consider 2 pointers pattern
        int [] result = new int[2];
        int lo = 0, hi = numbers.length-1;
        while(lo < hi){
            if(numbers[lo] + numbers[hi] == target){
                result[0] = lo+1;
                result[1] = hi+1;
                return result;
            }else if(numbers[lo] + numbers[hi] < target) {
                lo++;
            }else{
                hi--;
            }
        }
        return result;
    }
}
