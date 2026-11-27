class Solution {
    public List<List<Integer>> getSubArrays(int[] arr) {
        List<List<Integer>> mainlist = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        getSubArray(arr,mainlist,list,0,0);
        return mainlist;
    }
    
    public static void getSubArray(int arr[],List<List<Integer>> mainlist,List<Integer> list,int i,int j){
        if(j == arr.length){
            if(i+1 < arr.length){
                list = new ArrayList<>();
                getSubArray(arr,mainlist,list,i+=1,i);
            }
        }
        else if(j >= i && j < arr.length){
            list.add(arr[j]);
            mainlist.add(new ArrayList<>(list));
            getSubArray(arr,mainlist,list,i,j+=1);
        }
    }
    
}
