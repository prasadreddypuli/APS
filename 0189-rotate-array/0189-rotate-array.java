class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        recursive(nums,0,nums.length-1);
        recursive(nums,0,k-1);
        recursive(nums,k,nums.length-1);
    }
    public void recursive(int[] nums,int i, int j){
            while(i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
}