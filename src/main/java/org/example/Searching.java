package org.example;

public class Searching {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = i + 1;
        }
        int rand = (int) (Math.random() * 1500) + 1;
        System.out.println("Searching for " + rand + "...\n");
        long linearStartTime = System.nanoTime();
        System.out.println("Linear Search");
        int linearResult = linearSearch(arr, rand);
        if (linearResult != -1) {
            System.out.println("The index of our key is " + linearResult + ".");
        } else {
            System.out.println("Element not found.");
        }
        long linearEndTime = System.nanoTime();
        System.out.println("Linear took " + (linearEndTime - linearStartTime + "ns.\n"));
        long binaryStartTime = System.nanoTime();
        System.out.println("MeBinary Search");
        int binaryResult = binarySearch(arr, rand);
        if (binaryResult != -1) {
            System.out.println("The index of our key is " + binaryResult + ".");
        } else {
            System.out.println("Element not found.");
        }
        long binaryEndTime = System.nanoTime();
        System.out.println("MeBinary took " + (binaryEndTime - binaryStartTime) + "ns.\n");
    }
    private static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    private static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            int value = arr[middle];
            if(key < value) {
                high = middle - 1;
            } else if(key > value) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}