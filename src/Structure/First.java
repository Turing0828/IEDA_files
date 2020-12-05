package Structure;
/**
 * @ClassName: First
 * @Description:   稀疏数组
 * @author: h_xy
 * @date: 2020/12/3  19:10
 */
public class First {
    public static void main(String[] args) {
        int[][] array = new int[11][11];
        array[1][2] = 1 ;
        array[2][3] = 2 ;
        for(int[] row:array) {
            for (int data : row) {
                System.out.printf("%d\t", data);  //printf的用法  \t制表
            }
            System.out.println();
        }
        //计算sum
        int sum = 0;
        for(int i = 0;i< array.length;i++){
            for(int j= 0;j<array[i].length;j++){
                if(array[i][j]!=0){
                    sum++;
                }
            }
        }
        //定义一个数组
        int count =0;
        int[][] SparseArray = new int[sum+1][3];
        SparseArray[0][0] = array.length;
        SparseArray[0][1] = array[0].length;
        SparseArray[0][2] = sum;
        for(int i = 0 ;i< array.length;i++){
            for(int j= 0;j<array[i].length;j++){
                if(array[i][j]!=0){
                    count++;
                    SparseArray[count][0] =i;
                    SparseArray[count][1] =j;
                    SparseArray[count][2] =array[i][j];
                 }
            }
        }
        //输出稀疏数组
        System.out.println();
        System.out.println("制作的稀疏数组:");
        for(int[] row:SparseArray){
            for(int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
    }
}

