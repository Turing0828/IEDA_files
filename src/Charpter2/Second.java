package Charpter2;

/**
 * @ClassName: Second
 * @Description: 显示前三十个素数
 * @author: h_xy
 * @date: 2020/12/15  19:35
 */
public class Second {
    public static void main(String[] args) {
        //定义计数器
        int sum = 0;
        int number = 2 ;
        //用数组存储 30 个数字
        int[] num = new int[30];
        while(sum<30){
            boolean isture =true;
            for(int i =2 ;i <= number/2;i++){
                if(number%i==0){
                    isture = false ;
                    break;
                }
            }
            if(isture){
                System.out.println(number);
                sum++;
            }
            number++;
        }
    }
}
