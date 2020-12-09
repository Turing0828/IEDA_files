package LeetCode;
import java.util.Random;     //自动导包
import java.util.Stack;
/**
 * @ClassName: Four
 * @Description:  在栈内找到最小的元素
 * @author: h_xy
 * @date: 2020/12/7  20:29
 */
public class Four {
    public static void main(String[] args) {
        Random num = new Random(100);
        Stack<Integer> stack = new Stack<>();
        for(int i= 0;i<20;i++){
            int n = num.nextInt(100);
            stack.push(n);
        }
        int min=stack.peek();
        for(int a:stack){
            if(a<min){
                min = a;
            }
        }
        System.out.println(min);
        System.out.println(stack);
    }
}
