package LeetCode00;

public class Sum_to_num {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 26;

        int[] result = twoSum(nums, target);

        System.out.println("The indices are: " + result[0] + " and " + result[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
