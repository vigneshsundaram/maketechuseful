
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[]result=new int[2];
        HashMap<Integer,Integer>pairs=new HashMap<>();
        for(int index=0;index<nums.length;index++)
        {
            int tergetMinus=target-nums[index];
         if(pairs.containsKey(tergetMinus)&&index!=pairs.get(tergetMinus))
         {
            result[0]=index;
            result[1]=pairs.get(tergetMinus); 
            return result;
         }
         pairs.put(nums[index], index);
        }
        return result;
        }
       
   
    

    public static void main(String[] args) {
      int[] nums =new int[]{3,2,4};

        int target=6;
        Solution sol=new Solution();
       System.out.println( sol.twoSum(nums, target)[1]+" "+sol.twoSum(nums, target)[1]);
    }
}