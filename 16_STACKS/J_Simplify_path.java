// LEETCODE PROBLEM SIMPLIFY PATH-------------------------------------------------------------------

class Solution {
    public String simplifyPath(String path) {
        String [] paths=path.split("/");
        Stack<String>s=new Stack<>();
        for(int i=0;i<paths.length;i++){
            if(paths[i].equals(".")){
                continue;
            }

            else if(paths[i].equals(" ")){
                continue;
            }
            else if(paths[i].equals("..")){
                if(s.size()>0){
                    s.pop();
                }
            }else{
                s.push(paths[i]);
            }
        }

        String res=" ";
        while(s.size()>0){
            String folder=s.pop();
            res="/"+ folder+res;
        }
        if(res.length()==0) {
             return "/";


        }
         return res;
    }
}
           
        
    
   
        
        
    
