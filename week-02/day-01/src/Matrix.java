public class Matrix {

    public static void main(String[] args) {

        int matrixSize = 12;

        int[][] matrix = new int[matrixSize][matrixSize];

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                    System.out.print(matrix[i][j]);
                } else {
                    matrix[i][j] = 0;
                    System.out.print(matrix[i][j]);

                }

            }  System.out.println();
        }
    }
}




// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output
