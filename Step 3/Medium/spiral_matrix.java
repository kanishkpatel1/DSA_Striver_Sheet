import java.util.*;
public class spiral_matrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ls=new ArrayList<>();
          int row=matrix.length;
          if(row==0){
  return ls; }
          int col=matrix[0].length;
          int left=0,right=col-1,bottom=row-1,top=0;
          int d=0;
          while(left<=right && top<=bottom){
              if(d==0){
                  for(int i=left;i<=right;i++){
                      ls.add(matrix[top][i]);
                  }
                      top++;
                      d=1;
                  }
              else if(d==1){
                  for(int i=top;i<=bottom;i++){
                      ls.add(matrix[i][right]);
                      
                  }
                  right--;
                      d=2;
              }
              else if(d==2){
                  for(int i=right;i>=left;i--){
                      ls.add(matrix[bottom][i]);
                    
                  }
                    bottom--;
                      d=3;
              }
              else if(d==3){
                  for(int i=bottom;i>=top;i--){
                      ls.add(matrix[i][left]);
                  }
                  d=0;
                  left++;
              }
              
          }
          return ls;
      }
      public static void main(String[] args) {
          //Matrix initialization.
          int[][] mat = {{1, 2, 3,  4},
                        {5, 6, 7,   8},
                        {9, 10, 11, 12},
                        {13, 14, 15,16}};

List<Integer> ans = spiralOrder(mat);

for(int i = 0;i<ans.size();i++){
System.out.print(ans.get(i) + " ");
}

System.out.println();
      }
}
