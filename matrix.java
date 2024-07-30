public class matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1, 1},
                {1, 1, 0, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);
        transformMatrix(matrix);
        System.out.println("Transformed Matrix:");
        printMatrix(matrix);
    }

    public static void transformMatrix(int[][] matrix) {
        int rowNum = matrix.length;
        int colNum = matrix[0].length;
        int zeroRow = -1, zeroCol = -1;
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                if (matrix[i][j] == 0) {
                    zeroRow = i;
                    zeroCol = j;
                    break;
                }
            }
            if (zeroRow != -1) {
                break;
            }
        }
        if (zeroRow == -1 || zeroCol == -1) {
            System.out.println("No zero found in the matrix.");
            return;
        }
        for (int i = 0; i < colNum; i++) {
            matrix[zeroRow][i] = 0;
        }
        for (int i = 0; i < rowNum; i++) {
            matrix[i][zeroCol] = 0;
        }
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
