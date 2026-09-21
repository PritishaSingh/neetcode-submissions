class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int s=0;
        int e = matrix.length * matrix[0].length - 1;

        int cols = matrix[0].length;

        while (s <= e) {
            int m = s + (e - s) / 2;

            int row = m / cols;
            int col = m % cols;

            if (matrix[row][col] == target) {
                return true;
            } 
            else if (matrix[row][col] > target) {
                e = m - 1;
            } 
            else {
                s = m + 1;
            }
        }

        return false;
    }
}
