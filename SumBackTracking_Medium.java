class Solution {

        public static boolean validate(int[] arr, int target){
        int count = 0;
        for(int val : arr){
            count = count + val;
        }
        return count == target;
    }
    public static void recursion(int[] arr, int position, int target, ArrayList<Boolean> list){
        if(position == arr.length ){
            if(validate(arr, target)){
                list.add(true);
            }
            return;
        }
        int Negative = arr[position];
        arr[position] = -Negative;
        recursion(arr, position + 1, target, list);
        arr[position] = Negative;
         recursion(arr, position + 1, target, list);

    }


    public int findTargetSumWays(int[] nums, int target) {
        ArrayList<Boolean> list = new ArrayList<Boolean>();
        recursion(nums, 0,  target, list);
        return list.size();
    }
}
