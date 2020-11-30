package Chapter5;

/**
 * @ClassName: First
 * @Description: 冒泡算法
 * @author: h_xy
 * @date: 2020/11/27  18:07
 */
public class First {
    public static void main(String[] args) {
        int num[] = {1,4,5,3,8,2,12,32,0,6};
        System.out.println("原数组为：");
        for(int i = 0;i<num.length ;i++) {
            System.out.print(num[i]+"  ");
        }
        System.out.println("  ");
        //冒泡排序
        int sum ;
        for(int j =0 ;j <num.length;j++)
            for(int k = 0;k < num.length -j-1;k++){
                if(num[k]<num[k+1]){
                    sum = num[k+1];
                    num[k+1] = num[k];
                    num[k] =sum;
                }
            }
        System.out.println("冒泡算法后排序为  :   ");
            for(int n=0 ; n<num.length ; n++){
                System.out.print(num[n]+"  ");
            }

    }
}
