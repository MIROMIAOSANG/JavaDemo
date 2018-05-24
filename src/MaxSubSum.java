/**
 * 最大子列和
 */
public class MaxSubSum {
    public static int maxSubSum(int[] a) {
        int thisSum = 0;
        int maxSum = 0;
        for (int i = 0; i < a.length; i++) {
            thisSum = thisSum + a[i];
            if (thisSum > maxSum) {
                maxSum = thisSum;
            } else if (thisSum < 0) {
                thisSum = 0;
            }
        }
        return maxSum;
    }
}
