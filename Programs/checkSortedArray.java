class Solution {
    public boolean isSorted(int[] arr) {
        int val = arr[0];
        for(int i=1;i<arr.length;i++){
            if(val > arr[i]){
                return false;
            }
            else{
                val = arr[i];
            }
        }
        return true;
    }
}
