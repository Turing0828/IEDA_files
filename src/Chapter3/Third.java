package Chapter3;

/**
 * @ClassName: Third
 * @Description: 斐波拉切
 * @author: h_xy
 * @date: 2020/11/26  19:17
 */
public class Third {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            Fb(i);
            System.out.println("第" + i + "个月有" + Fb(i) + "只");
        }
        System.out.println("   ");
        for (int i = 0; i < 11; i++) {
            Fa(i);
            System.out.println("第" + i + "个月有" + Fa(i) + "只");
        }

    }

    static int Fb(int n) {   //递 归 问 题
        int f1, f2;
        if (n == 0 || n == 1) {
            return n;
        } else {
            f1 = Fb(n - 1);
            f2 = Fb(n - 2);
            return f1 + f2;
        }

    }

    static int Fa(int n) {  //循环算法
        int sum=0, f1=0, f2=1;

        if (n == 0 || n == 1) {
            return n;
        }
        for (int i = 1; i <=n; i++) {
            sum = f1 + f2;
            f2 = f1;
            f1 = sum;

        }
        return sum;
    }
}

