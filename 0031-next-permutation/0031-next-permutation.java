class Solution {
    public static void swap(int nums[], int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void nextPermutation(int[] nums) {
        // find the pivot
        int pivot=-1;
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            Arrays.sort(nums);
            return;
        }

        // to get the rightmost large value than pivot and swap 
        for(int i=nums.length-1; i>=pivot; i--){
            if(nums[i]>nums[pivot]){
                swap(nums,i,pivot);
                break;
            }
        }

        //reverse from pivot+1 to n-1
        int i=pivot+1;
        int j=nums.length-1;
        while(i<=j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}