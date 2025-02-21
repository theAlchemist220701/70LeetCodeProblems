import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int first= 0;
        int second = 0;
       HashMap<Integer,Integer> set = new HashMap<>();
       int[] result = new int[2];
       for(int i = 0; i<nums.length;i++){
        set.put(nums[i],i);
       }
       for(int i = 0 ;i<nums.length;i++){
        int diff = target - nums[i];
        if(set.containsKey(diff)&&set.get(diff)!=i){
            first = i ;
            second = set.get(diff);
            
        }
       }
    result[0]=first;
    result[1]=second;


return result;
   
    }
}