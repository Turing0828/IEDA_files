package Chapter6;
import java.util.Scanner;
/**
 * @ClassName: Five
 * @Description: 各种计算式的运算
 * @author: h_xy
 * @date: 2020/11/28  15:57
 */
public class Five {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            float a = in.nextFloat();
            char b = args[1].charAt(0);
            float c = in.nextFloat();
            float x = Sum(a,b,c);
            System.out.println(a+b+"="+c);
        }catch(ArithmeticException e){
            System.out.println("输入的数字有错误!!!");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("出现异常");
        }
    }

    static float total;
    static float Sum(float a,char b,float c)
    throws ArithmeticException{
        switch (b){
            case '+':total=a+b;
            break;
            case '-':total=a-b;
            break;
            case '*':total=a*b;
            break;
            case '/':total=a/b;
            break;
            default:
                System.out.println("输入的运算符不同");
        }
        return total;
    }
}
