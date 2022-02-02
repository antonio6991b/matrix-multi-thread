public class MatrixCounter {


    public int countSum(int[][] matrix){
        int res = 0;
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                res += matrix[i][j];
            }
        }
        return res;
    }

}
