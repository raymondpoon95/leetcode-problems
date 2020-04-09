class Solution {
    public boolean backspaceCompare(String S, String T) {
//         if(S.length() == 0 || T.length() == 0){
//             return false;
//         }
        
//         return checkString(S).equals(checkString(T));
//     }
    
//     private String checkString(String str){
//         Stack<Character> stack = new Stack<>();
        
//         for(char c : str.toCharArray()){
//             if(c != '#'){
//                 stack.push(c);
//             } else if(!stack.isEmpty()){
//                 stack.pop();
//             }
//         }
//         return String.valueOf(stack);
//     }
        
        int s = S.length()-1;
        int t = T.length()-1;
        int s_skip = 0;
        int t_skip = 0;
        
        while(s >= 0 || t >= 0){
            while(s >= 0){
                if(S.charAt(s) == '#'){
                    s_skip++;
                    s--;
                } else if(s_skip > 0){
                    s_skip--;
                    s--;
                } else {
                    break;
                }
            }
            
            while(t >= 0){
                if(T.charAt(t) == '#'){
                    t_skip++;
                    t--;
                } else if(t_skip > 0){
                    t_skip--;
                    t--;
                } else {
                    break;
                }
            }
            
            if(s >= 0 && t >= 0 && S.charAt(s) != T.charAt(t)){
                return false;
            }
            
            if((s >= 0) != (t >= 0)){
                return false;
            }
            
            s--;
            t--;
        }
        return true;
    }
}
