package LeetCode;
import java.util.Scanner;
/**
 * @ClassName: Five
 * @Description: 求最短路径
 * @author: h_xy
 * @date: 2020/12/9  19:32
 */
public class Five {
    public static void main(String[] args) {
        int m,n;
        System.out.println("请输入列 ， 行");
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();
        //定义数组
        int[][]  row  =  new int[m][n];
        //int[][] f = new int[][];
        //每一行
        for(int i= 0;i<n;i++){
            row[0][i] = 1;
        }
        for(int j=0 ;j <m;j++){
            row[j][0] = 1;
        }
        //整合
        for(int i=1;i<m;i++)
            for(int j=1;j<n;j++){
                row[i][j] = row[i-1][j] +row[i][j-1] ;
            }
        System.out.println(row[m-1][n-1]);
    }

}
