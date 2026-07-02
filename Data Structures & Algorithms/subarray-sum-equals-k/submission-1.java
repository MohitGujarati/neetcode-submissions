class Solution {
    public int subarraySum(int[] nums, int k) {

 

        int maxSubarray = 0;
       

        for (int i = 0; i < nums.length; i++) {
             int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];

                if (currentSum == k) {
                    maxSubarray++;
                }
            }
        }

        return maxSubarray;
    }
}

/*

Navie

2 loop i and j
take an variable as current sum and maxSubarray

if(currentsum == k){
maxSubarray++
}

at the end return maxSubarray


*/