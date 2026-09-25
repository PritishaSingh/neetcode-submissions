class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int prefix[]=new int[nums.length];
        // int suffix[]=new int[nums.length];
        // prefix[0]=1;
        // suffix[nums.length-1]=1;
        // for(int i=1; i<nums.length; i++){
        //     prefix[i]=prefix[i-1]*nums[i-1];
        // }

        // for(int j=nums.length-2; j>=0; j--){
        //     suffix[j]=suffix[j+1]*nums[j+1];
        // }

        // int ans[]=new int [nums.length];
        // for(int i=0; i<nums.length; i++){
        //     ans[i]=prefix[i]*suffix[i];
        // }
        // return ans;

         int n = nums.length;
        int[] ans = new int[n];

        // Step 1: Store prefix products
        int prefix = 1;

        for (int i = 0; i < n; i++) {
            ans[i] = prefix;
            prefix *= nums[i];
        }

        // Step 2: Multiply by suffix products
        int suffix = 1;

        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= suffix;
            suffix *= nums[i];
        }

        return ans;
    }
}  
