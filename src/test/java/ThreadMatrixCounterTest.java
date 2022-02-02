import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class ThreadMatrixCounterTest {

    private ThreadMatrixCounter threadMatrixCounter = new ThreadMatrixCounter();

    @Test
    public void testCountSum() throws InterruptedException {
        Random random = new Random();
        for (int i = 1; i < 50; i ++){
            int[][] matrix = new int[i][i + 5];
            for(int x = 0; x < matrix.length; x++){
                for(int y = 0; y < matrix[0].length; y++){
                    matrix[x][y] = random.nextInt(500);
                }
            }
            int expected = countSum(matrix);
            int current = threadMatrixCounter.countSum(matrix);
            Assert.assertEquals(expected, current);
        }
    }

    @Test
    public void addOneIfEvenTest() throws InterruptedException {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4, 435, 754},
                {6, 3, 3, 4, 455, 77},
        };

        threadMatrixCounter.addOneIfEven(matrix);

        int[][] expected = new int[][]{
                {1, 3, 3, 5, 435, 755},
                {7, 3, 3, 5, 455, 77},
        };
        Assert.assertArrayEquals(expected, matrix);
    }


    private int countSum(int[][] matrix){
        int res = 0;
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                res += matrix[i][j];
            }
        }
        return res;
    }

}
