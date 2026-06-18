class Solution {
    public String countAndSay(int n) {
        int count = 1;
        String result = "1";
        for(int i=2; i<=n; i++){
            StringBuilder sc = new StringBuilder();
            count = 1;
            for(int j=1; j<=result.length(); j++){
                if(j<result.length() && result.charAt(j)==result.charAt(j-1)){
                    count++;
                }else{
                    sc.append(count);
                    sc.append(result.charAt(j-1));
                    count = 1;
                }
            }
            result = sc.toString();
        }
        return result;
    }
}