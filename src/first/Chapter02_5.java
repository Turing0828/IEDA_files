package first;
import java.util.Scanner;
public class Chapter02_5 {
    public static void main(String[] args)
    throws Exception{
        final int money = 100; //总共的钱
        final int Bool1 = 25; //一株仙草花费的钱
        final int Bool2 = 20; //一株仙花花费的钱
        int Bool1_up = 20;
        int Bool2_up = 22;
        int Max = 0;
        int num1=0,num2=0;
        int gold;
        Scanner in = new  Scanner(System.in);
        System.out.println(" 请输入你要使用的金币");
        gold = in.nextInt();
            for (int i = 0; i < gold / Bool1; i++)
                for (int j = 0; j < gold / Bool2; j++) {
                    if (i * Bool1 + j * Bool2 < money && i * Bool1_up + j * Bool2_up > Max) {
                         num1 = i;
                         num2 = j;
                        Max = i * Bool1_up + j * Bool2_up;
                    }
                }
            System.out.println("仙草的数量   "+num1+"    仙花的数量     "+num2);



    }
}
