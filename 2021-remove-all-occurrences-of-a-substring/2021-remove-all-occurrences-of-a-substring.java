class Solution {
    public String removeOccurrences(String s, String part) {
        int i;
        while((i=s.indexOf(part)) !=-1){
            s = s.substring(0,i) + s.substring(i+part.length());
        }
        return s;
    }
}
