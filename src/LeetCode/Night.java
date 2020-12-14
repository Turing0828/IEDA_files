package LeetCode;

/**
 * @ClassName: Night
 * @Description:  求两个数组的中位数
 * @author: h_xy
 * @date: 2020/12/10  19:55
 */
public class Night {
    public static void main(String[] args) {
        int num1[] = {2,4,6};
        int num2[] = {3,7,9,12};
        int sum =solution(num1,num2);
        System.out.println("中位数："+sum);
    }
    static int solution(int[] num1,int[] num2){
        //将两个数组和并成一个数组
        int[] total = new int[num1.length+num2.length];
        int sum =0;
        for(int i=0;i<num1.length;i++){
            total[i] = num1[i];
        }
        for(int j=0;j<num2.length;j++){
            total[j+num1.length-1] = num2[j];
        }
        //冒泡算法排序
        for(int i=0;i<total.length;i++)
            for(int j=0;j<total.length-i-1;j++){
                if(total[j]<total[j+1]){
                    int temp = total[j];
                    total[j] = total[j+1];
                    total[j+1] = temp;
                }
            }
        //求中位数
        if(total.length%2==0){
           sum= (total[total.length/2]+total[total.length/2-1])/2;
        }
        else{
            sum = total[(total.length+1)/2];
        }
        return sum;
    }

}

