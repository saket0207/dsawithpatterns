package twopointers;

public class SquareSortedArray {

    public static void main(String[] args) {
        int [] nums = {-4,-1,0,3,10};
        SquareSortedArray squareSortedArray = new SquareSortedArray();
        int [] sortedSquared = squareSortedArray.sortedSquares(nums);
        for(int n: sortedSquared){
            System.out.print(n + " ");
        }


    }
    public int[] sortedSquares(int[] nums) {

        //array is already sorted
        //when squared, the order will change, because the -ve numbers' sqaure will become +ve
        //Hence rearrangement is required. Makes it a candidate of 2 pointers pattern
        int x = 0;
        for(; x < nums.length; x++){
            if(nums[x] >= 0){
                break;
            }
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        } //O(n)
        int lo = 0, hi = x-1;
        while(lo < hi){
            if(nums[lo] > nums[hi]){
                int temp = nums[lo];
                nums[lo] = nums[hi];
                nums[hi] = temp;
            }
            lo++;
            hi--;
        }
        if(x == nums.length){
            return nums;
        }
        int p1 = 0, p2 = x;
        int arr[] = new int[nums.length];
        int k = 0;
        while(p1 < x && p2 < nums.length){
            if(nums[p1] < nums[p2]){
                arr[k++] = nums[p1++];
            }else{
                arr[k++] = nums[p2++];
            }
        }
        while(p1 < x){
            arr[k++] = nums[p1++];
        }
        while(p2 < nums.length){
            arr[k++] = nums[p2++];
        }

        return arr;

    }
}
