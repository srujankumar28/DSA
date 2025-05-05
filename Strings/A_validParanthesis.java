class Solution {
    public String A_validParanthesis(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(count > 0){
                    sb.append(ch);
                }
                count++;
            }
            else{
                count--;
                if(count > 0){
                    sb.append(ch);
                }
            }
        }
        return sb.toString(); // u need to return a valid parenthesis by removing the outermost unnceessary parenthisis.. 
        (()())(()) --> ans for this should be ()()() --> yellow colored parenthesis are valid parenthesis
    }
}
