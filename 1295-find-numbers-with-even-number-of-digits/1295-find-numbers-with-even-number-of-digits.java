class Solution {
    public int findNumbers(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            int count = 0;
            int curr_arr=nums[i];
            while(curr_arr>0){
                count++;
                curr_arr = curr_arr/10;
            }
            if(count%2==0){
                total++;
            }
        }
        return total;
    }
}