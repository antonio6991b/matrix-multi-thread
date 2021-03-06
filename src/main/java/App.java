public class App {

    public static void main(String[] args) throws InterruptedException {
        int[][] matrix = new int[][]{

                {1, 2, 3, 76, 5, 6, 7, 2, 3, 76, 5, 2, 3, 76, 5},
                {2, 2, 23, 234, 5, 6, 7, 2, 3, 76, 5, 2, 3, 76, 5},
                {3, 2, 234, 4, 5, 6, 7, 2, 3, 76, 5, 2, 3, 76, 5},
                {3, 2, 234, 4, 5, 6, 7, 2, 3, 76, 5, 2, 3, 76, 5},
                {3, 2, 234, 4, 5, 6, 7, 2, 3, 76, 5, 2, 3, 76, 5},
                {3, 2, 234, 4, 5, 6, 7, 2, 3, 76, 5, 2, 3, 76, 5},
                {4, 2, 3, 4, 5, 567, 7, 2, 3, 76, 5, 2, 3, 76, 5},
                {5, 2, 3, 4, 5, 6, 7, 2, 3, 76, 5, 2, 3, 76, 5},
                {3, 2, 234, 4, 5, 6, 7, 2, 3, 76, 5, 2, 3, 76, 5},
                {3, 2, 234, 4, 5, 6, 7, 2, 3, 76, 5, 2, 3, 76, 5},
                {3, 2, 234, 4, 5, 6, 7, 2, 3, 76, 5, 2, 3, 76, 5},
                {1, 2, 3, 76, 5, 6, 7, 2, 3, 76, 5, 2, 3, 76, 5},
                {2, 2, 23, 234, 5, 6, 7, 2, 3, 76, 5, 2, 3, 76, 5},
                {3, 2, 234, 4, 5, 6, 7, 2, 3, 76, 5, 2, 3, 76, 5},
                {3, 2, 234, 4, 5, 6, 7, 2, 3, 76, 5, 2, 3, 76, 5},
                {3, 2, 234, 4, 5, 6, 7, 2, 3, 76, 5, 2, 3, 76, 5},
                {3, 2, 234, 4, 5, 6, 7, 2, 3, 76, 5, 2, 3, 76, 5},
                {4, 2, 3, 4, 5, 567, 7, 2, 3, 76, 5, 2, 3, 76, 5},
                {5, 2, 3, 4, 5, 6, 7, 2, 3, 76, 5, 2, 3, 76, 5},
                {3, 2, 234, 4, 5, 6, 7, 2, 3, 76, 5, 2, 3, 76, 5},
                {3, 2, 234, 4, 5, 6, 7, 2, 3, 76, 5, 2, 3, 76, 5},
                {3, 2, 234, 4, 5, 6, 7, 2, 3, 76, 5, 2, 3, 76, 5},
                {3, 2, 234, 4, 5, 6, 7, 2, 3, 76, 5, 2, 3, 76, 5},
                {3, 2, 234, 4, 5, 6, 7, 2, 3, 76, 5, 2, 3, 76, 5},
                {3, 2, 234, 4, 5, 6, 7, 2, 3, 76, 5, 2, 3, 76, 5},
                {3, 2, 234, 4, 5, 6, 7, 2, 3, 76, 5, 2, 3, 76, 5},
                {3, 2, 234, 4, 5, 6, 7, 2, 3, 76, 5, 2, 3, 76, 5},
                {3, 2, 234, 4, 5, 6, 7, 2, 3, 76, 5, 2, 3, 76, 5},

        };
        MatrixCounter matrixCounter = new MatrixCounter();
        ThreadMatrixCounter threadMatrixCounter = new ThreadMatrixCounter();
        System.out.println(matrixCounter.countSum(matrix));
        System.out.println(threadMatrixCounter.countSum(matrix));
    }
}
