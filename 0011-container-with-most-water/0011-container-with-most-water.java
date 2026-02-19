class Solution {
    public int maxArea(int[] height) {
        int maxW=0;
        int left=0;
        int right=height.length-1;

        while(left<right){
            int width=right-left;
            int ht=Math.min(height[left],height[right]);
            int currW=width*ht;
            maxW=Math.max(currW,maxW);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxW;
    }
}