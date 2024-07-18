package backtracking;

public class NQueens {
    private static int countNQueensSolutions(int n) {
        int[] result = {0};
        solveNQueens(new int[n], 0, result);
        return result[0];
    }

    private static void solveNQueens(int[] queens, int row, int[] result) {
        if (row == queens.length) {
            result[0]++;
            return;
        }
        for (int col = 0; col < queens.length; col++) {
            if (isValid(queens, row, col)) {
                queens[row] = col;
                solveNQueens(queens, row + 1, result);
            }
        }
    }

    private static boolean isValid(int[] queens, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col || Math.abs(queens[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(countNQueensSolutions(n)); // Output: 2
    }
}

