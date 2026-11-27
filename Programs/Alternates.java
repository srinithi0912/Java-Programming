class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list = getAlternative(arr,list,0);
        return list;
    }
    public static ArrayList<Integer> getAlternative(int[] arr,ArrayList<Integer> list,int i){
        if(i >= arr.length){
            return list;
        }
        else{
            list.add(arr[i]);
            return getAlternative(arr,list,i+=2);
        }
    }
}
