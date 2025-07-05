public class leetcode1_1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++){
                if (nums[i] + nums[j] == target && i != j){
                    int[] solucion = {i,j};
                    return solucion;
                }
            }
        }
        int[] solucion = {0,0};
        return solucion;

    }
}
