class Solution {
    public int maximumProduct(int[] nums) {
        sort(nums);
      
    int n = nums.length;

        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int product2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(product1, product2);
        
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