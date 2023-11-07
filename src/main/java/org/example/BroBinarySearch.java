package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class BroBinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        int rand = (int)(Math.random() * 1200) + 1;
        System.out.println("Searching for " + rand);
        int index = broBinarySearch(arr, rand);
        if (index != -1) {
            System.out.println("Key is found at " + index);
        } else {
            System.out.println("Element could not be found.");
        }
    }
    private static int broBinarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            int value = arr[middle];
            if (key == value) {
                return middle;
            } else if (key > value) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }
}