import java.util.*;
class Spiralmatrix{
    public List<Integer> spiral(int[][] matrix){
        List<Integer> result=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int startrow=0;
        int endrow=n-1;
        int startcol=0;
        int endcol=m-1;
        while(startrow<=endrow && startcol<=endcol){
            for(int j=startcol;j<=endcol;j++){
                result.add(matrix[startrow][j]);
            }
            startrow+=1;
            for(int i=startrow;i<=endrow;i++){
                result.add(matrix[i][endcol]);
            }
            endcol-=1;
            if(startrow<=endrow){
                for(int j=endcol;j>=startcol;j--){
                    result.add(matrix[endrow][j]);
                }
                endrow-=1;
            }
            if(startcol<=endcol){
                for(int i=endrow;i>=startrow;i--){
                    result.add(matrix[i][startcol]);
                }
                startcol+=1;
            }
        }
        return result;

    }
}