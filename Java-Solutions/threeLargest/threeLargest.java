// Find the 3 largest number in an array

public class threeLargest{

    public static int[] getThreeLargest(int[] nums) {

        int first = 0;
        int second = 0;
        int third = 0;

        for (int i = 0; i < nums.length; i++) {
            
            if(nums[i] > first) {
                third = second;
                second = first;
                first = nums[i];
            } else if (nums[i] > second) {
                third = second;
                second = nums[i];
            } else if (nums[i] > third) {
                third = nums[i];
            }
        }
        return new int[] {first, second, third};

    }

    public static void main(String[] args) {
        int[] nums = {200, 3, 5, 9, 2, 12, 45, 100, 55};
        int[] newArray = getThreeLargest(nums);
        System.out.println(newArray[0] + " " + newArray[1] + " " + newArray[2]);
    }



}