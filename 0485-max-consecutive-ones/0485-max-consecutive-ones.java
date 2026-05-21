class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLen = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
            }else{
                maxLen = Math.max(maxLen,count);
                count = 0;
            }
        }
        maxLen = Math.max(maxLen,count);
        return maxLen;
    }
}