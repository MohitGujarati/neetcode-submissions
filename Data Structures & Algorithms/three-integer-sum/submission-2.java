class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> uniqueTriplets = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);

                        Collections.sort(triplet);

                        uniqueTriplets.add(triplet);
                    }
                }
            }
        }

        return new ArrayList<>(uniqueTriplets);
    }
}

/*

3 loops 0(n**3) 0(n) space - naive approach 
 public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> uniqueTriplets = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);

                        Collections.sort(triplet);

                        uniqueTriplets.add(triplet);
                    }
                }
            }
        }

        return new ArrayList<>(uniqueTriplets);


*/
