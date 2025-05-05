//ITS A LEETCODE SOULTION WHICH IS COPY PASTED HERE.. PLS DO REFER THE LEETCODE FOR FURTHER INFORMATION

class Solution {
    public int[] asteroidCollision(int[] asteroids) {

    Stack<Integer> s= new Stack<>();
    for(int i=0;i<asteroids.length;i++){
        int stones= asteroids[i];
        if(stones>0){
            s.push(stones);

        }else if((s.size()==0) ||( s.peek()<0)){
            s.push(stones);
            

        }else if(s.peek()< - stones){
            s.pop();
            i--;
        }else if(s.peek()== -stones){
            s.pop();
        }
    }

    int[] res= new int[s.size()];
    int i=res.length-1;
    while(s.size()>0) res[i--]=s.pop();
    return res;
    }
 
    

       
    

    
}