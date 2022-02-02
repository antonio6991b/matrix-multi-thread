public class LineThread implements Runnable{

    private int[][]matrix;
    private int lineNumber;
    private int sum;

    public LineThread(int[][] matrix, int lineNumber){
        this.matrix = matrix;
        this.lineNumber = lineNumber;
        this.sum = 0;
    }

    @Override
    public void run() {

        for(int i = 0; i < matrix[0].length; i ++ ){
            this.sum += matrix[lineNumber][i];
        }
    }
    public int getSum(){
        return this.sum;
    }
}
