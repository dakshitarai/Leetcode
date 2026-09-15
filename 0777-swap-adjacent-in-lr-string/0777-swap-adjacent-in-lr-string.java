class Solution {
    public boolean canTransform(String start, String result) {
        StringBuilder s = new StringBuilder();
         StringBuilder n = new StringBuilder();
        if(start.length()!=result.length()){
            return false;
        }
       int x=0;
       int l=0;
       int r=0;
       for(int i=0 ; i<start.length() ; i++){
        if(start.charAt(i)=='X'){
            x++;
        } else if (start.charAt(i)=='L'){
            l++;
        } else {
            r++;
        }
       }
       int x1=0;
       int l1=0;
       int r1=0;
       for(int j=0 ; j<result.length() ; j++){
        if(result.charAt(j)=='X'){
            x1++;
        } else if (result.charAt(j)=='L'){
            l1++;
        } else {
            r1++;
        }
       
        } 
        if(x!=x1 || l!=l1 || r!=r1){
            return false;
        }
        for(int i=0 ; i<start.length() ; i++){
            if(start.charAt(i)!='X'){
                s.append(start.charAt(i));
            }
        }
        for(int j=0 ; j<result.length() ; j++){
            if(result.charAt(j)!='X'){
                n.append(result.charAt(j));
            }
        }
        if (!s.toString().equals(n.toString())) {
    return false;
}
int i = 0;
int j = 0;

while (i < start.length() && j < result.length()) {

    while (i < start.length() && start.charAt(i) == 'X') {
        i++;
    }

    while (j < result.length() && result.charAt(j) == 'X') {
        j++;
    }

    if (i == start.length() || j == result.length()) {
        break;
    }

    if (start.charAt(i) == 'L' && i < j) {
        return false;
    }

    if (start.charAt(i) == 'R' && i > j) {
        return false;
    }

    i++;
    j++;
}
return true;
    }
}