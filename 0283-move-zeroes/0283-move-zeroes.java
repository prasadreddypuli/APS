class Solution {
    public void moveZeroes(int[] nums) {
        int[] result = new int[nums.length];
        int i=0;
        int index = 0;
        while(i<nums.length){
            if(nums[i]!=0){
                nums[index] = nums[i];
                index++;
            }
            i++;
        }
        while(index<nums.length){
            nums[index] = 0;
            index++;
        }
    }
}