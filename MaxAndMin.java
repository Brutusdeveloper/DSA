import java.util.*;
public class Main {
    public static void maxMin(int[] arr, int position, int max, int min){
        if(position == arr.length - 1 ){
            System.out.println("max : "+ max+"\n"+"min : "+ min);
            return;
        }
        if(arr[position] > max){
            max = arr[position];
        }
        if(arr[position] < min){
            min = arr[position];
        }
        int[] arrCopy = Arrays.copyOfRange(arr, position, arr.length);
        maxMin(arrCopy,  position + 1 , max, min);
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        maxMin(arr, 1, arr[0], arr[0]);
    }
}
