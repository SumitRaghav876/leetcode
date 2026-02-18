class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        // HashSet<Integer> set=new HashSet<>();
        int n=grid.length;
        int sq=n*n;
        int arr[]=new int[sq+1];

        int currSum=0;
        int ans[]=new int[2];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[grid[i][j]]!=0){
                    //repeating value
                    ans[0]=grid[i][j];
                }
                else{
                    arr[grid[i][j]]=1; 
                    currSum+=grid[i][j];
                }
            }
        }
        int totalSum=sq*(sq+1)/2;
        ans[1]=totalSum-currSum; //Missing value
        return ans;
    }
}