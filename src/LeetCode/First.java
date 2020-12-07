package LeetCode;
//import java.util.LinkedList;
import java.util.Stack;

/**
 * @ClassName: First
 * @Description:  有效夸号
 * @author: h_xy
 * @date: 2020/12/6  20:46
 */
public class First {
    public static void main(String[] args) {
        String s = "(){}{}";
        isture(s);
    }
    static boolean isture(String s ){
        if(s.length()%2==0){
            Stack<Character> stack = new Stack<>();    // 定义一个字符栈
            for(int i= 0;i<s.length();i++) {
                char c = s.charAt(i);
                if(c=='('||c=='{'||c=='['){
                    stack.push(c);
                }
                else if(c==')'){
                    if(!stack.isEmpty()&&stack.peek()=='('){
                        stack.pop();
                    }
                    else return  false;
                }
                else if(c==']'){
                    if(!stack.isEmpty()&&stack.peek()=='['){
                        stack.pop();
                    }
                    else return false;
                }
                else if(c=='}'){
                    if(!stack.isEmpty()&&stack.peek()=='{'){
                        stack.pop();
                    }
                    else return  false;
                }
                return stack.isEmpty();
            }
        }
        return  false;
    }

}
