class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) return new ArrayList<>();
    Set<List<Integer>> set = new HashSet<>();
    int n = nums.length;
    Arrays.sort(nums);
    for (int i = 0; i < n - 3; i++) {
        for (int j = i + 1; j < n - 1; j++) {
            int low = j + 1;
            int high = n - 1;
            while (low < high) {
                if (nums[i] + nums[low] + nums[high] + nums[j] == target) {
                    set.add(Arrays.asList(nums[i], nums[low], nums[high], nums[j]));
                    while (low < high && nums[low] == nums[low + 1])
                        low++;
                    while (low < high && nums[high] == nums[high - 1])
                        high--;
                    low++;
                    high--;
                } else if (nums[i] + nums[low] + nums[high] + nums[j] < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }
    }
    return new ArrayList<>(set);
    }
}
