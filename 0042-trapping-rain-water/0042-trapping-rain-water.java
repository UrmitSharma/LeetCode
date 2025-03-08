class Solution {
    public int trap(int[] height) {
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for(int i =1 ; i<height.length;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        int n=height.length;
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for (int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        int trappedwater = 0;
        for (int i =0 ; i<n ; i++){
            int waterlevel = Math.min(leftmax[i],rightMax[i]);
            trappedwater += waterlevel-height[i];


        }
        return trappedwater;
    }
}