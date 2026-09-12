class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      int []ans = new int[nums1.length];
      for(int i=0 ; i<nums1.length ; i++){
        int x=-1;
        Stack<Integer> st = new Stack<>();
        for(int j=nums2.length-1 ; j>=0 ; j--){
            while(!st.isEmpty() && st.peek()<=nums1[i]){
                st.pop();
            }
            if(nums1[i]==nums2[j]){
                if(!st.isEmpty()){
                    x=st.peek();
                }
                break;
            }
           st.push(nums2[j]);
        }
         ans[i]=x;
      }  
      return ans;
    }
}