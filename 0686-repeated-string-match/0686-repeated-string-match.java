class Solution {
    public int repeatedStringMatch(String a, String b) { 
        int count = 0;
        StringBuilder s = new StringBuilder();
        while(s.length()<b.length()){
            s.append(a);
            count++;
        }
  if (s.indexOf(b) != -1) {
            return count;
        }

        s.append(a);
        count++;

        if (s.indexOf(b) != -1) {
            return count;
        }

        return -1;
    }
}