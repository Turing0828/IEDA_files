package LeetCode;
import java.util.Stack;
/**
 * @ClassName: Second
 * @Description:  网球计分
 * @author: h_xy
 * @date: 2020/12/7  19:04
 */
public class Second {
    public static void main(String[] args)
    throws Exception{
        Stack<Integer> stack = new Stack<>();  //定义一个整数栈
        String[] s ={"2","3","D","C","+"};
        for(String c:s){
            if(c.equals("D")){
                stack.push(2 * stack.peek());
            }
            else if(c.equals("+")){
                int top = stack.peek();
                stack.pop();
                int newtop = stack.peek();
                stack.push(top);
                stack.push(top+newtop);
            }
            else if(c.equals("C")){
                stack.pop();
            }
            else{
                stack.push(Integer.valueOf(c));      //将字符转化为整形
            }
        }
        int total=0;
        for(int a  :stack){
            total+=a;
        }
        System.out.println("总得分为:"+total);
    }
}
