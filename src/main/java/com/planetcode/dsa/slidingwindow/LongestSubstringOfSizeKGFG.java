package com.planetcode.dsa.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringOfSizeKGFG {

    public static void main(String[] args) {
        LongestSubstringOfSizeKGFG substring = new LongestSubstringOfSizeKGFG();
        String s = "mlg";
        int k = 1;
        int len = substring.findLongestSubStringOfSizeK(s, k);
        System.out.println(len);
    }

    private int findLongestSubStringOfSizeK(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0, maxLen = -1;
        for(int j = 0; j < s.length(); j++){

            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            while(map.size() > k){


                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) - 1);
                    if(map.get(s.charAt(i)) == 0){
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
            }
            if (map.size() == k) {
                maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
    }
}
