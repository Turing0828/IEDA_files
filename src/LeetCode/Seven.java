package LeetCode;

import java.util.Stack;

/**
 * @ClassName: Seven
 * @Description:  找钱问题
 * @author: h_xy
 * @date: 2020/12/10  19:02
 */
public class Seven {
    public static void main(String[] args) {
        //定义一个整数栈
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        String[] s  = {"5","5","5","10","20"};
        //分情况讨论
        int sum =0;
        for(String a :s){
            if(a.equals("5")){
                stack.push(Integer.valueOf(a));   //将数组元素转化为整数
            }
            else if(a.equals("10")&&stack.peek()==5){
                    stack.pop();
                    stack.push(Integer.valueOf("10"));
            }
            else{
                 stack2 = stack;
                while(!stack2.isEmpty()){
                    sum = sum + stack2.peek();
                    stack2.pop();
                }
                if(sum%10==0&&sum%5==0&&sum>=15)
                {
                    stack.push(Integer.valueOf("20"));
                }
            }
        }
        System.out.println(stack);
    }

}
