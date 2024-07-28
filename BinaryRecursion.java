// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// PS : The name of the public class has to be Main for the code to work

import java.util.*;
public class Main {
    public static int BinaryRecursion(int[] arr, int target, int start, int end){  

        if(start < end){
           int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] < target){
            return recursion(arr, target, mid + 1, end);
        }
        if(arr[mid] > target){
            return recursion(arr, target, start, mid - 1);
        }
        } 

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        System.out.println(BinaryRecursion(arr, 9, 0, arr.length - 1));
    }
}
