class Solution {
    public int[] asteroidCollision(int[] asteroids) 
    {
    
        Stack<Integer> stack =new Stack<>();
    
        for(int size : asteroids)
        {
            
         if(size>0)
         {
             stack.push(size);
         }
         else
         {
             while(!stack.isEmpty()&&stack.peek()>0&&stack.peek()<Math.abs(size))
             {
                 stack.pop();
             }
             if(stack.isEmpty()||stack.peek()<0)
             {
                 stack.push(size);
             }
             else if(size+stack.peek()==0)
             {
                 stack.pop();
             }
         }
            
        }
        int []result=new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--)
        {
            result[i]=stack.pop();
        }
        return result;
    }
}
