class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int ans[]={-1};
        for(int i=0; i<nums.length; i++){
            int rem=target-nums[i];
            if(mp.containsKey(rem)){
                ans=new int[]{i,mp.get(rem)};
                return ans;
            }
            mp.put(nums[i], i);
        }

        return ans;
    }
}
