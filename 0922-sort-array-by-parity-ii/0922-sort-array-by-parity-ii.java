class Solution {
    public int[] sortArrayByParityII(int[] nums) {
      int i=0;
      int j=1;
      while(i<nums.length && j<nums.length){
        if(nums[i]%2==0){
            i+=2;
            } else if(nums[j]%2==1) {
                j+=2;
            }
         else {
           swap(nums,i,j);
        }
      }
      return nums;
    }
    static void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}