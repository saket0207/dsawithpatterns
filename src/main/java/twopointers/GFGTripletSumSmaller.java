package twopointers;

import java.util.Arrays;

public class GFGTripletSumSmaller {

    int countTriplets(int sum, int arr[]) {
        // code here 1,3,4,5,7 - 12
        Arrays.sort(arr);
        int n = arr.length, count = 0;
        for(int i = 0; i < n - 2; i++){
            int lo = i + 1, hi = n - 1;
            while(lo < hi){
                int tripletSum = arr[i] + arr[lo] + arr[hi];
                if(tripletSum < sum){ //we are interested in only when tripletSum is less than target sum
                    count = count + (hi - lo); // anything between lo and high will result in triplet smaller than target
                    lo++;
                }else{
                    hi--;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] arr = {-2, 0, 1, 3};
        int target = 12;
        GFGTripletSumSmaller tripletSumSmaller = new GFGTripletSumSmaller();
        System.out.println(tripletSumSmaller.countTriplets(target, arr));
    }
}
