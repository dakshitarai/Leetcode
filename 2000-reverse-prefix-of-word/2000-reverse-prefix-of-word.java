class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        String temp = word.substring(index+1,word.length());
        String temp2 = word.substring(0,index+1);
        StringBuilder temp3 = new StringBuilder(temp2);
       String temp1 = temp3.reverse().toString();
       String ans = temp1 + temp;
       return ans;

    }
}