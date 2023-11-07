package org.example;

import java.util.Arrays;

public class Sortings {
    public static void main(String[] args) {
        int[] arr1 = {2, 888, 1, 11, 4, 9, 1000, 450, 77, 16, 21, 77777, 9898, 6516, 454777, 0, 74, 14};
        int[] arr2 = {2, 888, 1, 11, 4, 9, 1000, 450, 77, 16, 21, 77777, 9898, 6516, 454777, 0, 74, 14};
        int[] arr3 = {2, 888, 1, 11, 4, 9, 1000, 450, 77, 16, 21, 77777, 9898, 6516, 454777, 0, 74, 14};
        //BroBubble Sort
        long broBS = System.nanoTime();
        int[] broBSArr = broBubbleSort(arr1);
        long broBF = System.nanoTime();
        System.out.println(Arrays.toString(broBSArr));
        System.out.println("BroBubble Sort took " + (broBF - broBS + "ns.\n"));
        //BroBubble Sort
        //Selection Sort
        long selectionS = System.nanoTime();
        int[] selectionArr = selectionSort(arr2);
        long selectionF = System.nanoTime();
        System.out.println(Arrays.toString(selectionArr));
        System.out.println("Selection Sort took " + (selectionF - selectionS + "ns.\n"));
        //Selection Sort
        //Insertion Sort
        long insertionS = System.nanoTime();
        int[] insertionSort = insertionSort(arr3);
        long insertionF = System.nanoTime();
        System.out.println(Arrays.toString(insertionSort));
        System.out.println("Insertion Sort took " + (insertionF - insertionS + "ns.\n"));
        //Insertion Sort
    }
    private static int[] broBubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j - 1]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
    private static int[] selectionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
        return arr;
    }
    private static int[] insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > tmp){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = tmp;
        }
        return arr;
    }
}
// 2, 16, 1, 11, 4, 9
// 1, 2, 16, 11, 4, 9 i = 3
//
// i = 0... 2, 16, 1, 11, 4, 9
// i = 1...