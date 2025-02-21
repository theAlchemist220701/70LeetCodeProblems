import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
class Solution {
    
    public List<Integer> findDuplicates(int[] nums) {
        List <Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                int k = map.get(nums[i]);
                map.put(nums[i],k+1);

            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    if(entry.getValue()==2){
        list.add(entry.getKey());
    }
    
}
return list ;

    }
}