public class Solution {
    public int maxSubArray(int[] A) {
        int ret = A[0], sum = 0;
		for(int i = 0; i < A.length; ++i)
		{
			sum = Math.max(sum + A[i], A[i]);
			ret = Math.max(ret, sum);
		}
		return ret;
    }
}