package SingleNumber;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int uniqueNumber = 0;
        for (int num : nums) {
            uniqueNumber ^= num;
        }
        return uniqueNumber;
    }
}
