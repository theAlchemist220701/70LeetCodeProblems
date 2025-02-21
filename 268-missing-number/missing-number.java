import java.util.ArrayList;
class Solution {
    public int missingNumber(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
           int n = nums.length;
        for (int i = 0; i <= n; i++) {
            list.add(-1);
        }
        for (int num : nums) {
            list.set(num, num);
        }

      for (int i = 0; i <= n; i++) {
            if (list.get(i) == -1) {
                return i;
            }
        }
        return -1;
    }
}