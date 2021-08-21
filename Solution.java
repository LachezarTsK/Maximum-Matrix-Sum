
public class Solution {

    public long maxMatrixSum(int[][] matrix) {
        long sumAbsoluteValues = 0;
        int minimumAbsoluteValue = Integer.MAX_VALUE;
        int numOfNegatives = 0;

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                sumAbsoluteValues += Math.abs(matrix[r][c]);
                minimumAbsoluteValue = Math.min(minimumAbsoluteValue, Math.abs(matrix[r][c]));
                if (matrix[r][c] < 0) {
                    numOfNegatives++;
                }
            }
        }
        long result = numOfNegatives % 2 == 0 ? sumAbsoluteValues : sumAbsoluteValues - 2 * minimumAbsoluteValue;
        return result;
    }
}
