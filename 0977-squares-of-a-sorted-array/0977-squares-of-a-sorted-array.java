class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length ; i++){
            ans[i]=nums[i]*nums[i];
            
        } sort(ans);
        return ans;
    }
    static void sort(int[] nums){
      
           for (int i = 0; i < nums.length - 1; i++) {
    int min = i;

    for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] < nums[min]) {
            min = j;
        }
    }

    int temp = nums[min];
    nums[min] = nums[i];
    nums[i] = temp;
}
        
    }
}