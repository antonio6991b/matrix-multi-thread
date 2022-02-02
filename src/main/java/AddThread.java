public class AddThread implements Runnable{

    private int[][]matrix;
    private int lineNumber;


    public AddThread(int[][] matrix, int lineNumber){
        this.matrix = matrix;
        this.lineNumber = lineNumber;

    }

    @Override
    public void run() {
        for(int i = 0; i < matrix[0].length; i ++ ){
            if(matrix[lineNumber][i] % 2 == 0){
                matrix[lineNumber][i] ++;
            }
        }
    }
}
