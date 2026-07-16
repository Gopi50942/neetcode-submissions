class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[]res=new int[n];
        for (int i=0;i<nums.length;i++){
            int pod=1;
            for (int j = 0; j < n; j++) {
                if (i != j) { // Skip the current element
                    pod = nums[j] * pod;
                }
            }
            res[i]=pod;
        }return res;
    }
}  
