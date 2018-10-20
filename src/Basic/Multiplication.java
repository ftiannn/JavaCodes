package Basic;

public class Multiplication {
	public static void main(String[] args) {
        int row1 = 2, col1 = 3;
        int row2 = 3, col2 = 2;
        int[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} };
        int[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} };

        // Mutliplying Two matrices
        int[][] product = new int[row1][col2];
        for(int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        // Displaying the result
        System.out.println("Sum of two matrices is: ");
        for (int row = 0; row < product.length; row++) {
            for (int col = 0; col < product[row].length; col++) {
                System.out.print(product[row][col] + " ");
            }
            System.out.println();
        }

        }
    }


