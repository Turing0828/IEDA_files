package Chapter5;

import java.util.Calendar;

/**
 * @ClassName: Third
 * @Description: 输出数组的最大最小值
 * @author: h_xy
 * @date: 2020/11/27  19:11
 */
public class Third {
    public static void main(String[] args) {
        int sum[] ={2,4,5,7,3,1,14};
        int max =sum[0];
        int min =sum[0];
        double total=0.0;
        for(int i=0;i< sum.length;i++){
            if(sum[i]>=max)
                max =sum[i];
            if(sum[i]<=min)
                min =sum[i];
            total =total+sum[i];
        }
        System.out.println("最大值 :"+max +"  "+"最小值"+min+"    "+"平均值为:"+total/sum.length);
    }
}
