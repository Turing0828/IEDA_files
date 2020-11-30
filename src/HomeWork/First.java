package HomeWork;

import java.util.Scanner;

/**
 * @ClassName: First
 * @Description: TODO
 * @author: h_xy
 * @date: 2020/11/30  16:59
 */
public class First {
   // 1. 编写一个Java程序，用if-else语句判断某年份是否为闰年。
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("请输入一个年份 ：");
       int year = in.nextInt();
       if(year%4==0&&year%100!=0||year%400==0){
           System.out.println(year+"为闰年");
       }
       else{
           System.out.println(year+"不为闰年");
       }

   }


}
