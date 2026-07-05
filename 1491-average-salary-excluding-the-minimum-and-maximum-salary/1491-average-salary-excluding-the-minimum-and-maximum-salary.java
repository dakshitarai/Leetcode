class Solution {
    public double average(int[] salary) {
      int[] ans = new int[salary.length-2];
      sort(salary);
       double sum=0;
      for(int i=1 ; i<salary.length-1 ; i++){
        ans[i-1] = salary[i];
      } 
      for(int i=0 ; i<ans.length ; i++){
       
        sum += ans[i];
      }
      double average = sum/ans.length;
      return average;
    }
    static void sort(int[] nums){
        for(int i=0 ; i<nums.length ; i++){
            int last=nums.length-i-1;
            int maxIndex = getMaxIndex(nums,0,last);
            swap(nums,maxIndex,last);
        }
    }
    static int getMaxIndex(int[] nums,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(nums[max]<nums[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] nums , int a , int b){
       int temp=nums[a];
       nums[a]=nums[b];
       nums[b]=temp;
    }
}