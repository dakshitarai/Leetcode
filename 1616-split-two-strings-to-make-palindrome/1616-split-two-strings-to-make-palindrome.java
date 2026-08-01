class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        return check(a,b) || check(b,a);
    }
    public boolean check(String a, String b){
        if(a.length()==1 && b.length()==1){
            return true;
        }
      
        int left=0;
        int right=b.length()-1;
        while(left<right && a.charAt(left)==b.charAt(right)){
                left++;
                right--;
        }
        return palindrome(a,left,right)||palindrome(b,left,right);
    }
        public boolean palindrome(String s, int left, int right) {

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
    }
