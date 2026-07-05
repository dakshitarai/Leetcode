class Solution {
    public int maxProduct(int[] nums) {
      sort(nums);
      int ans = (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
      return ans;  
    }
    static void sort(int[] nums){
        for(int i=0 ; i<nums.length ; i++){
            int last=nums.length-i-1;
            int maxIndex=getMaxIndex(nums,0,last);
            swap(nums,maxIndex,last);
        }
    }
    static int getMaxIndex(int[] nums, int start, int end){
         int max = start;
        for (int i = start; i <= end; i++) {
            if (nums[max] < nums[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    }
