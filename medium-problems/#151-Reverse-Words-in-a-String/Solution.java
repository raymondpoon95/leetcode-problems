class Solution {
    public String reverseWords(String s) {
        if(s.length() == 0 || s == null) return s;
        
//         Stack<String> stack = new Stack<>();
//         StringBuilder sb = new StringBuilder();
        
//         for(String input : s.split(" ")){
//             stack.push(input);
//         }
        
//         while(!stack.isEmpty()){
//             if(!stack.peek().equals(""))
//                 sb.append(stack.pop() + " ");
//             else
//                 stack.pop();
//         }
//         return sb.toString().trim();

        String[] text = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(int i = text.length-1; i >= 0; i--){
            if(text[i].equals(""))
                continue;
            sb.append(text[i] + " ");
        }
        return sb.toString().trim();
    }
}
// time complexity of both methods is O(N)
// space complexity of method using stack is O(N) and second solution is O(1)
