class Solution {
    public String reverseWords(String s) {
       String ch[]=s.trim().split(" +");

        StringBuilder sb=new StringBuilder("");
       int n=ch.length-1;
       for(int i=n; i>=0; i--){
        sb.append(ch[i]);
        if(i==0){
            break;
        }
        sb.append(" ");
       }
    return sb.toString();
       
    }
}