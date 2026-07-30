class Solution {
    public int lengthOfLastWord(String s) {
         String [] ans = s.trim().split(" ");
      
      String a = ans[ans.length-1];
      
      return a.length();
    }
}