package Chapter6;
import java.io.*;
import java.util.*;
/**
 * @ClassName: Third
 * @Description:  判断输入的数据是否异常
 * @author: h_xy
 * @date: 2020/11/28  12:04
 */
public class Third {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        double num;
        boolean isture = false;
        do {
            try {
                System.out.println("请输入一个数:  ");
                num = in.nextDouble();
                System.out.println("浮点数为：" + num);
                isture = false;
            } catch (InputMismatchException e) {   //捕获的条件里可以放另外的条件
                System.out.println("数据类型错误，请重新输入!!!");
                isture = true;
                String x = in.nextLine();    //再次输入的机会
            }
        } while(isture);
    }
}
