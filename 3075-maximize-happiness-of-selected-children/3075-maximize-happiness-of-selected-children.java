class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int penalty=0;
        long h=0;
        // ascending order sort
        Arrays.sort(happiness);
        //reverse the sorted array for descending order
        int start=0,end=happiness.length-1;
        while(start<end){
            int temp=happiness[start];
            happiness[start]=happiness[end];
            happiness[end]=temp;
            start++;
            end--;
        }
        
        for(int i=0; i<k; i++){
            if(happiness[i]-penalty<=0) break;
            h+=happiness[i]-penalty;
            penalty++;
        }
        return h;
    }
}