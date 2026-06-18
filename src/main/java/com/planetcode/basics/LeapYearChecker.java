package com.planetcode.basics;

public class LeapYearChecker {

    public static void main(String[] args) {

        int a = 1900, b = 2000, c = 2100, d = 2001, e = 4;
        boolean isALeapYear = checkLeapYear(a);
        System.out.println(isALeapYear ? System.out.printf("%d is a leap year.", a): System.out.printf("%d is not a leap year.", a));
        boolean isBLeapYear = checkLeapYear(b);
        System.out.println(isBLeapYear ? System.out.printf("%d is a leap year.", b): System.out.printf("%d is not a leap year.", b));
        boolean isCLeapYear = checkLeapYear(c);
        System.out.println(isCLeapYear ? System.out.printf("%d is a leap year.", c): System.out.printf("%d is not a leap year.", c));
        boolean isDLeapYear = checkLeapYear(d);
        System.out.println(isDLeapYear ? System.out.printf("%d is a leap year.", d): System.out.printf("%d is not a leap year.", d));
        boolean isELeapYear = checkLeapYear(e);
        System.out.println(isELeapYear ? System.out.printf("%d is a leap year.", e): System.out.printf("%d is not a leap year.", e));
    }

    private static boolean checkLeapYear(int a) {
        boolean isLeap = false;
        if(a % 4 == 0){
            isLeap = true;
            if(a % 100 == 0){
                isLeap = a % 400 == 0;
            }
        }
        return isLeap;
    }
}
