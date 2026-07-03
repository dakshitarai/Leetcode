class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        int[] ans=new int[heights.length];
        for(int i=0 ; i<heights.length ; i++){
            ans[i]=heights[i];
        }
        sort(heights);
         for(int j=0 ; j<heights.length ; j++){
            if(heights[j]!=ans[j]){
                count++;
            }
         }
        return count;
    }
    static void sort(int[] nums){
        for(int i=0 ; i<nums.length ; i++){
            int last = nums.length-i-1;
            int maxIndex = getMaxIndex(nums,0,last);
            swap(nums,maxIndex,last);
        }
    }
        static int getMaxIndex(int[] nums,int start,int end){
            int max=start;
            for(int i=start ; i<=end ; i++){
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