class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] ans = new char[word1.length()+word2.length()];
        int a=0;
        int b=0;
        
        for(int i=0 ; i<ans.length ; i++){
           if(i%2==0 && a<word1.length()){
            ans[i]=word1.charAt(a);
            a++;
           } else if(b<word2.length()) {
            ans[i]=word2.charAt(b);
            b++;
           } else {
            ans[i]=word1.charAt(a);
            a++;
           }
        }
       return new String(ans);
    }
}