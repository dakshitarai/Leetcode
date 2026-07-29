class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> ans = new HashMap<>();
        ans.put('I',1);
        ans.put('V',5);
        ans.put('X',10);
        ans.put('L',50);
        ans.put('C',100);
        ans.put('D',500);
        ans.put('M',1000);
        int sum =0;
        for(int i=0; i<s.length(); i++){
            int curr = ans.get(s.charAt(i));
            if(i<s.length()-1 && curr<ans.get(s.charAt(i+1))){
               sum -= curr;
            } else {
                sum += curr;
            }
        }
        return sum;
    }
}