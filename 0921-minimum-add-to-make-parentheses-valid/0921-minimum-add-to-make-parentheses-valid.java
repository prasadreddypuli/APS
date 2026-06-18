class Solution {
    public int minAddToMakeValid(String s) {
        // if(s.length()%2 != 0){
        //     return -1;
        // }

        int open = 0;
        int close = 0;

        for(Character ch:s.toCharArray()){
            if(ch=='('){
                open++;
            }else{
                if(open>0){
                    open--;
                }else{
                    close++;
                }
            }
        }
        return open+close;
    }
}