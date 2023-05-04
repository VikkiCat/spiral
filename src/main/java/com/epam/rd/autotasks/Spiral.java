package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int [][] matrix = new int [rows][columns];
        // Initialize value to be filled in matrix
        int val = 1;

        /*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index */
        int k = 0, l = 0;
        while (k < rows && l < columns) {
            /* Print the first row from the remaining
          rows */
            for (int i = l; i < columns; ++i) {
                matrix[k][i] = val++;
            }

            k++;

            /* Print the last column from the remaining
          columns */
            for (int i = k; i < rows; ++i) {
                matrix[i][columns - 1] = val++;
            }
            columns--;

            /* Print the last row from the remaining
           rows */
            if (k < rows) {
                for (int i = columns - 1; i >= l; --i) {
                    matrix[rows - 1][i] = val++;
                }
                rows--;
            }

            /* Print the first column from the remaining
           columns */
            if (l < columns) {
                for (int i = rows - 1; i >= k; --i) {
                    matrix[i][l] = val++;
                }
                l++;
            }
        }
        return matrix;
    }
}
