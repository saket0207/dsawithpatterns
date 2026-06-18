package com.planetcode.dsa.twopointers;

public class DutchNationalFlagLC75 {

    //Rearrange array
    //in Place rearrangement
    public void sortColors(int[] arr) {
        int lo = 0, mid = 0, hi = arr.length - 1;

        while(mid <= hi){
            if(arr[mid] == 0){
                int temp = arr[lo];
                arr[lo] = arr[mid];
                arr[mid] = temp;
                lo++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                int temp = arr[hi];
                arr[hi] = arr[mid];
                arr[mid] = temp;
                hi--;
            }
        }
    }

    public static void main(String[] args) {
        int [] nums = {2,0,2,1,1,0};
        DutchNationalFlagLC75 lc75 = new DutchNationalFlagLC75();
        lc75.sortColors(nums);
        for (int num : nums) {
            System.out.print(num);
        }
    }
}
