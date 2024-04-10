import java.util.*;
public class Set_Matrix_zeroes {
    // Bruteforce:----------------->
    // Set the 0's row and column as -1 because if we make whole row and column in next
    //  iteration it can create ambiguity

    // Better Approach------------>
    static public void setZeroes(int[][] matrix) {
        List<Integer> row=new ArrayList<>();
        List<Integer> col=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);

            }
        }
    }

      for(int i=0;i<row.size();i++){
        for(int j=0;j<matrix[0].length;j++){
            matrix[row.get(i)][j]=0;
        }
      }
      for(int i=0;i<col.size();i++){
        for(int j=0;j<matrix[0].length;j++){
            matrix[j][col.get(i)]=0;
        }
      }
    }

    // Appproach 2: Using 2 array to store the 0 as the ith position 
    static void setZeroes2(int matrix[][]){
        int row[]=new int[matrix.length];
        int col[]=new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;

                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }

        
    } 
    
    // Optimal Approach: ----------------------------------------->

    // without extra space use first row and first column to mark the row and col zero 

    static void setZeroes3(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(arr);
        System.out.println(Arrays.deepToString(arr));
           // Output: [[1,0,1],[0,0,0],[1,0,1]};
        int arr2[][]={{1,1,1},{1,0,1},{1,1,1}};
        setZeroes2(arr2);
        System.out.println(Arrays.deepToString(arr2));
           // Output: [[1,0,1],[0,0,0],[1,0,1]};
    }
}
