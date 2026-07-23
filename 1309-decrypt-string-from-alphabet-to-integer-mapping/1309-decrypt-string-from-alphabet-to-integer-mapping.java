class Solution {
    public String freqAlphabets(String s) {
        StringBuilder ans  = new StringBuilder();
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(i+2<s.length() && s.charAt(i+2)=='#'){
                int num = (s.charAt(i)-'0')*10+(s.charAt(i+1)-'0');
                char ch = (char)('a'+num-1); 
                 ans.append(ch);
            i+=3;
        }
           else {
            int num=s.charAt(i)-'0';
            char ch = (char)('a'+num-1);
            ans.append(ch);
            i++;
           }
        }
        return ans.toString();
    }
}