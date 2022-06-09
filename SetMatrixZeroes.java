import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int matrix[][]) {
        boolean row_flag = false;
        boolean col_flag = false;
 
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0 && matrix[i][j] == 0)
                    row_flag = true;
 
                if (j == 0 && matrix[i][j] == 0)
                    col_flag = true;
 
                if (matrix[i][j] == 0) {
 
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
                }
        }
 
        for (int i = 1; i < matrix.length; i++)
            for (int j = 1; j < matrix[0].length; j++)
                if (matrix[0][j] == 0 || matrix[i][0] == 0)
                    matrix[i][j] = 0;
 
        
        if (row_flag == true)
            for (int i = 0; i < matrix[0].length; i++)
                matrix[0][i] = 0;
 
        
        if (col_flag == true)
            for (int i = 0; i < matrix.length; i++)
                matrix[i][0] = 0;
    }
                  
    }

