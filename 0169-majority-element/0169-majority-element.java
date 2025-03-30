class Solution {
    public int majorityElement(int[] nums) {
        int val=-1;
        int count=0;

        for(int i=0; i<nums.length; i++){
            if(count==0){
                count=1;
                val=nums[i];
            }
            else if(val==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return val;
    }
}