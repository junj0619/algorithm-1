public class Solution {
    /*
     * @param nums: A list of integers
     * @return: nothing
     */
    public void wiggleSort(int[] nums) {
        if (nums == null || nums.length == 0){
            return;
        }
        
        for (int i = 1; i < nums.length; i ++){
            if ((i%2 == 1 && nums[i] < nums[i-1])
                || (i%2 == 0 && nums[i] > nums[i-1])
                ){
                    swap(nums, i, i-1);
                }
        }
    }
    
    private void swap(int[] nums, int i, int j){
       int temp = nums[i];
       nums[i] = nums[j];
       nums[j] = temp;
    }
}
