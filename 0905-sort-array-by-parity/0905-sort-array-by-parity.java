class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];

        int k=0;
        for(int i=0; i<n; i++){
            if(nums[i]%2==0){
                res[k]=nums[i];
                k++;
            }
        }

        int j=0;
        while(j<n ){
            if(nums[j]%2 !=0){
                res[k]=nums[j];
                k++;
            }
            j++;
        }
        return res;
    }
}