class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int dupVal=-1;
        for(int i=1; i<n; i++){
            if(nums[i]==nums[i-1]){
                dupVal=nums[i];
                break;
            }
        }
        return dupVal;
    }
}