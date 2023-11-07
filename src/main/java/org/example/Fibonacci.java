package org.example;

public class Fibonacci {
    private static long[] fibCache;
    public static void main(String[] args) {
        int n = 10;
        fibCache = new long[n + 1];
        System.out.println(fib(n));
    }
    private static long fib(int n) {
        if(n <= 1) {
            fibCache[n] = n;
            return n;
        }
        if(fibCache[n] != 0) {
            return fibCache[n];
        }
        long result = fib(n - 1) + fib(n - 2);
        fibCache[n] = result;
        return result;
    }
}
// 0 1 1 2 3 5 8 13 21 34