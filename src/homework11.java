import java.util.Random;

public class homework11 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix(4, 4);
        fillMatrixRandomly(matrix);
        printMatrix(matrix);

        int EvenElSum = sumOfElementsInEvenRows(matrix);
        int OddElSum = sumOfElementsInOddRows(matrix);
        int productOfEven=productOfElementsInEvenRows(matrix);
        int productOfOdd=productOfElementsInOddRows(matrix);

        System.out.println("Sum of even elements:" + EvenElSum);
        System.out.println("Sum of odd elements:" + OddElSum);
        System.out.println("Product of even elements:" + productOfEven);
        System.out.println("Product of odd elements:" + productOfOdd);
    }

    private static int productOfElementsInOddRows(int[][] matrix) {
        int product = 1;
        for (int j = 1; j < matrix[0].length; j += 2) {
            for (int i = 0; i < matrix.length; i++) {
                product *= matrix[i][j];
            }
        }
        return product;
    }

    private static int productOfElementsInEvenRows(int[][] matrix) {
        int product = 1;
        for (int j = 0; j < matrix[0].length; j += 2) {
            for (int i = 0; i < matrix.length; i++) {
                product *= matrix[i][j];
            }
        }
        return product;
    }

    private static int sumOfElementsInOddRows(int[][] matrix) {
        int sum = 0;
        for (int i = 1; i < matrix.length; i += 2) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    private static int sumOfElementsInEvenRows(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i += 2) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    private static void printMatrix(int[][] matrix) {
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }


    private static int[][] createMatrix(int rows, int cols) {
        return new int[rows][cols];
    }

    private static void fillMatrixRandomly(int[][] matrix) {
        Random rand = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = rand.nextInt(51);
            }
        }
    }
}


