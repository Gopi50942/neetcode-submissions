class Solution {
    public int maxArea(int[] heights) {
      int maxarea=0;
      int left=0,right=heights.length-1;
      while(left<right){
        int height=Math.min(heights[left],heights[right]);
        int width=right-left;
        int area=height*width;
        maxarea=Math.max(area,maxarea);
        if(left<right){
            left++;
        }
        else{
            right--;
        }
      }return maxarea;  
    }
}
