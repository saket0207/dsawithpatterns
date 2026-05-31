package com.dsa.twopointers;

public class GFGSegregateZerosAndOnes {
    //Question has input in Arrays/ sorted or sorting(like here) will make easy/rearrange(like here)
    public void segregate0and1(int[] arr) {
        // code here
        int lo = 0, hi = arr.length - 1;
        while(lo < hi){
            if(arr[lo] == 0){
                lo++;
            }else if(arr[hi] == 1){
                hi--;
            }else{
                int temp = arr[lo];
                arr[lo] = arr[hi];
                arr[hi] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        GFGSegregateZerosAndOnes zerosAndOnes = new GFGSegregateZerosAndOnes();
        zerosAndOnes.segregate0and1(arr);
        for(int a: arr){
            System.out.print(a + " ");
        }

    }
}
