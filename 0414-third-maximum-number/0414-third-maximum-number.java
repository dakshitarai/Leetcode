class Solution {
    public int thirdMax(int[] nums) {
        sort(nums);
      int count=1;
      int prev=nums[nums.length-1];
     for(int i=nums.length-2 ; i>=0 ; i--){
        if(nums[i]!=prev){
            count++;
            prev=nums[i];
        }
        if(count==3){
            return nums[i];
        }
     }
     return nums[nums.length-1];
          }
    static void sort(int[] nums){
         for(int i=0; i<nums.length ; i++){
        int last=nums.length-1-i;
        int maxIndex=maxIndex(nums,0,last);
        swap(nums,maxIndex,last);
     }
    }
    static int maxIndex(int[] nums,int start,int end){
        int max=start;
        for(int i=start; i<=end ; i++){
            if(nums[max]<nums[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}