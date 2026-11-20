class Solution {
    public int digitalRoot(int n) {
        int count=0;
        int temp = n,sum=0;
        while(temp != 0){
            sum += (temp % 10);
            temp /= 10;
            if(temp == 0 && sum > 9){
                temp = sum;
                sum = 0;
            }
        }
        return sum;
    }
};
