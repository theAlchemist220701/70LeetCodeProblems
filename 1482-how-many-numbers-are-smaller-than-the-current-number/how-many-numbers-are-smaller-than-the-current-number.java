import java.util.Arrays;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] arr = new int[nums.length];
        int [] result = new int[nums.length];  
        for(int i = 0;i<nums.length;i++){
            arr[i] = nums[i] ;
        }      
        Arrays.sort(nums);
        for(int i = 0 ; i<arr.length;i++){
            int k  = arr[i];
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<k){
                    count++;
                }
                else{break;}
            }
            result[i]=count;
        }

                return result;
    }
}