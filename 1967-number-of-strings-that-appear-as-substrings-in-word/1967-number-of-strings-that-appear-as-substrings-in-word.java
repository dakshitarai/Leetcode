class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        
            for(int j=0 ; j<patterns.length ; j++){
                if(word.contains(patterns[j])){
                    count++;
                }
            
        }
        return count;
    }
}