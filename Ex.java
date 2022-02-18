public class Ex {
    public static void main(String[] args) throws Exception {
        int[] v = { 7, 2, 10, 9 };
        int diff = bigDiff(v);
        System.out.println("Diferença = " + diff);
    }

    public static int bigDiff(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (min < nums[i]) {
                min = nums[i];
            }

            if (max > nums[i]) {
                max = nums[i];
            }

        }
        return max - min;

    }

}
