public class leet268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actualSum = (n * (n + 1)) / 2;
        int givenSum = 0;
        for (int i = 0; i < nums.length; i++) {
            givenSum = givenSum + nums[i];
        }
        return actualSum - givenSum;
    }
}
