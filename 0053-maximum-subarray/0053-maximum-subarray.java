class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int largest = nums[0];
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            largest = Math.max(largest,sum);
            if(sum<0){
                sum=0;
            }
        }
        return largest;
    }
}