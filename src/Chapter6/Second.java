package Chapter6;
/**
 * @ClassName: Second
 * @Description: 抛出异常
 * @author: h_xy
 * @date: 2020/11/28  11:47
 */
public class Second {
    public static void main(String[] args) {
        try {
            int a=0;
            int b = 5/a;    //除数不能为零
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        }
        System.out.println("正常结束");
    }
}
