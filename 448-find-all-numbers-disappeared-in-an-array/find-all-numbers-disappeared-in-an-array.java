import java.util.ArrayList;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList <>();
        for(int i = 0;i<nums.length;i++){
            list.add(-1);
        }
        for(int i:nums){
            list.set(i-1,i);
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i)==-1){
                result.add(i+1);
            }
        }

        
        
    return result;
    }
}