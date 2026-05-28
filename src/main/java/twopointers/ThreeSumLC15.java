package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumLC15 {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;

        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < n - 2; i++){

            int target = -nums[i];
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int lo = i + 1;
            int hi = n - 1;
            while(lo < hi){
                int sum = nums[lo] + nums[hi];
                if(sum == target){
                    List<Integer> ir = List.of(nums[i], nums[lo], nums[hi]);
                    result.add(ir);
                    lo++;
                    hi--;
                    while(lo < hi && nums[lo] == nums[lo - 1]){
                        lo++;
                    }
                    while(lo < hi && nums[hi] == nums[hi+1]){
                        hi--;
                    }
                }else if(sum < target){
                    lo++;
                }else{
                    hi--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] nums = {-1,0,1,2,-1,-4};
        ThreeSumLC15 threeSum = new ThreeSumLC15();
        List<List<Integer>> result = threeSum.threeSum(nums);
        System.out.println(result);
    }
}
