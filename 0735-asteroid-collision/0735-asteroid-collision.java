class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for(int a:asteroids){
            boolean alive = true;
            while(alive==true && !s.isEmpty() && s.peek()>0 && a<0){
                if(Math.abs(a)<s.peek()){
                    alive=false;
                }else if(s.peek()<Math.abs(a)){
                    s.pop();
                }else{
                    alive = false;
                    s.pop();
                }
            }
            if(alive==true){
                s.push(a);
            }
        }
        int[] result = new int[s.size()];
        for(int i = s.size()-1; i>=0; i--){
            result[i] = s.pop();
        }
        return result;
    }
}