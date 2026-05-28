class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int val:map.keySet()) {
            if(map.get(val)>n/3){
                list.add(val);
            }
        }
        return list;
    }
}