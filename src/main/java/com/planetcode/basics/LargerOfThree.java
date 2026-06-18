package com.planetcode.basics;

public class LargerOfThree {

    public static void main(String[] args) {
        int a = 5, b = 4, c = 2;
        int res = getLargest(b, c, a);
        System.out.println(res);
    }

    private static int getLargest(int b, int c, int a) {
//        int temp = (Math.max(b, c));
        return Math.max(a, Math.max(b, c));
    }
}
