class Solution {
    public int searchInsert(int[] nums, int target) {
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]>=target){
        //         return i;
        //     }
            
        // }
        // return nums.length;
        int l = 0;
        int r = nums.length;

        while (l < r) {
        int mid = (l + r) / 2;
        if (nums[mid] == target)
            return mid;
        if (nums[mid] < target)
            l = mid + 1;
        else
            r = mid;
        }

        return l;
    }
}