// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// PS : The name of the public class has to be Main for the code to work
// Given an array Arr[] of size N, print all the subsets of the array.

// Subset: A subset of an array is a tuple that can be obtained from the array by removing some (possibly all) elements of it

// Example:

// Input: N = 3, Arr = [1, 2, 3]
// Output: {}
// {1}
// {1, 2}
// {1, 2, 3}
// {1, 3}
// {2}
// {2, 3}
// {3}
// Explanation: These are all the subsets that can be formed from the given array, it can be proven that no other subset exists other than the given output.

    public class Main {

    public static void recursion(String processed, String unProcess){
        if(unProcess.isEmpty()){
            System.out.println(processed);
            return;
        }
        String firstChar = String.valueOf((unProcess.charAt(0)) - '0'); 
        String subChar = unProcess.substring(1);

        recursion(firstChar + processed , subChar);
         recursion(processed , subChar);
    }

    public static void main(String[] args) {
        recursion("", "123");
    }
}
