package first;
//import java.io.IOException;
import java.util.Scanner;
public class Chapter02 {
    public static void main(String[] args)
    {
        //定义人群
        int status ;
        //定义 工资
        double money;
        //定义税收
        double sale;
        System.out.println("请输入你的状态  :  1-单身  ，2-结婚 ，3- 家庭");
        Scanner in = new Scanner(System.in);
        System.out.println("你的状态：  ");
        try{
            status = in.nextInt();

        System.out.println("你的收入为：  ");
        Scanner out =new Scanner(System.in);
            money = out.nextDouble();

        System.out.println("开始计算要交的税收!!!");
            if (status == 1) {
                if (money <=6000.00) {
                    sale = 0.6 * money;
                } else {
                    sale = 0.3 * money;
                }
            }
            else
            {
                sale =0;
            }
            System.out.println("你要交的税收为:"+ sale);
        }catch (ArithmeticException e){
            System.out.println("输入出现错误");}
        }
    }

