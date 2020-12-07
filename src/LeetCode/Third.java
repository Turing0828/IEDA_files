package LeetCode;

import java.util.Stack;

/**
 * @ClassName: Third
 * @Description: 用两个栈来模拟队列
 * @author: h_xy
 * @date: 2020/12/7  19:57
 */
public class Third {
    public static void main(String[] args) {

    }
    class Myqueue{
        Stack<Integer> s = new Stack<>();  //正的栈
        Stack<Integer> s1 = new Stack<>(); //反的栈
        private int front =-1;
        private int rear =-1;
        private int Maxsize;
        public Myqueue(int maxsize){
            Maxsize = maxsize;
        }
        //push
        public void push(int x){
            if(s.isEmpty()){
                front = x;
            }
            s.push(x);
        }
        //pop
        public void pop(){
            if(s1.isEmpty()){
                while(!s.isEmpty())
                    s1.push(s.pop());
            }
            s1.pop();
        }
        //isEmpty
        public boolean isEmpty(){
            return s.isEmpty()&&s1.isEmpty();
        }
        //peek
        public int  peek(){
            if(!s1.isEmpty())
                return s1.peek();
            return front;
        }
    }
}
