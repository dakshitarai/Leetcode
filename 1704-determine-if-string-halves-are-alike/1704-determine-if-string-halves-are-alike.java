class Solution {
    public boolean halvesAreAlike(String s) {
        int countv=0;
       
        int countw=0;
       
        for(int i=0 ; i<s.length()/2 ;i++){
            
                if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
                    countv++;
                }
            }
            for(int j=s.length()/2 ; j<s.length() ; j++){
            
                if(s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u' || s.charAt(j)=='A' || s.charAt(j)=='E' || s.charAt(j)=='I' || s.charAt(j)=='O' || s.charAt(j)=='U'){
                    countw++;
                } 
            }
        if(countv==countw){
            return true;
        }
        return false;
    }
}