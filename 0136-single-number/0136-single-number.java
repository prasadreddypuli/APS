class Solution {
    public int singleNumber(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int val:nums){
        map.put(val,map.getOrDefault(val,0)+1);
       }
       for(int i:map.keySet()){
        if(map.get(i)==1){
            return i;
        }
       } 
       return -1;
    }
}