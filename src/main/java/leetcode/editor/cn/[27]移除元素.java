package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution11 {
    public int removeElement(int[] nums, int val) {
        int slow = 0, fast = 0;
        while (fast < nums.length){
            if(nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
