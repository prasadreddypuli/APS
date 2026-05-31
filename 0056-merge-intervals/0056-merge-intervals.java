class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
        List<int[]> list = new ArrayList<>();
        int[] left = intervals[0];
        for(int i=1; i<intervals.length; i++){
            int[] right = intervals[i];
            if(left[1]>=right[0]){
                left[1] = Math.max(left[1],right[1]);
            }else{
                list.add(left);
                left = right;
            }
        }
        list.add(left);
        return list.toArray(new int[list.size()][]);
    }
}