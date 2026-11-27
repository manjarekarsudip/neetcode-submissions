class Solution {
    public int removeElement(int[] nums, int val) {
        HashSet<Integer> hs = new HashSet<>();
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                hs.add(nums[i]);
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}