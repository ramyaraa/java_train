package bro_1;

public class SanQuestion {
    public static void main(String[] args) {
        int[] test = {1, 6, 2, 2, 7, 1, 6, 99, 99, 7};


        int index = sum67(test);

        System.out.println("this is the "+index);
    }


    public static int sum67(int[] nums) {
        int x = 6;
        int y = 7;
        int z;
        boolean temp1 = true;
        boolean temp2 = false;
        boolean tempswap;
        int sum=0;

        for(int i=0; i< nums.length  ; i++){
            if(nums[i]==x){
                z = x;
                x = y;
                y = z;
                tempswap = temp1;
                temp1 = temp2;
                temp2 = tempswap;
                System.out.println("swap");
            }
            else if(temp1 == true){
                System.out.println("add "+ nums[i]+" to "+ sum);
                sum +=nums[i];
            }
        }
        return sum;
    }
}
