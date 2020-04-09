class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder str = new StringBuilder();
        
        for(String word : arr){
            str.append(new StringBuilder(word).reverse().toString() + " ");
        }
        
        return str.toString().trim();
    }
}
