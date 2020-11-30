package first;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Chapter02_4 {
    public static void main(String[] args) {
        int days=0;
        System.out.println("请输入年份");
        Scanner inYear = new Scanner(System.in);
        int Year  =  inYear.nextInt();
        System.out.print("请输入月份");
        Scanner inMonth = new Scanner(System.in);
        int Month = inMonth.nextInt();
        switch(Month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:  days=31;break;
            case 4:
            case 6:
            case 9:
            case 11: days =30;break;
            case 2:     if(Year%4==0||Year%400==0)
            {
                days=29;
            }
                        else{
                            days=28;
            }



        }
        System.out.println(Year+"年"+Month+"月"+days +"日");



    }
}
