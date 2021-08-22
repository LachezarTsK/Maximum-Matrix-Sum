
public class Solution {

    /*
    1. If all integers are non-negative, then all just get summed up.

    2. If the number of negative integers is even, or odd with at least one zero in the matrix, 
       then all negative integers can be turned into non-negative.

    3. If the number of negative integers is odd and there is no zero in the matrix, 
       it is inevitable that one number will remain negative. 
       In this case, find the integer with minimum absolute value.
       This value will be the single remaining negative integer.
    */
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
