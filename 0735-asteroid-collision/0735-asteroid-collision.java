class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s=new Stack<>();
        for(int x:asteroids)
        {
            boolean alive=true;
            while(!s.isEmpty()&&s.peek()>0&&x<0)
            {
                int r=s.peek();
                if(r<-x)
                {
                    s.pop();
                }
                else if(r==-x)
                {
                    s.pop();
                    alive=false;
                    break;
                }
                else
                {
                    alive=false;
                    break;
                }
                
            }
            if(alive)
            {
                s.push(x);
            }
        }
        int[] result = new int[s.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = s.pop();
        }

        return result;
    }
}