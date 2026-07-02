class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;

        while(i < g.length && j < s.length){
            if(s[j] >= g[i]){
                i++;
            }
            j++;
        }
         return i;
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