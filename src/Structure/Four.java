package Structure;

/**
 * @ClassName: Four
 * @Description: 栈的应用
 * @author: h_xy
 * @date: 2020/12/5  20:40
 */
public class Four {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        for(int i=0;i<4;i++)
        stack.InStack(i);
        stack.Liststack();
    }
}

//定义一个栈类
class Stack {
//定义元素
    private int Maxsize;
    private int[] stack;
    private int top =-1;
//定义初始化
    public Stack(int maxsize){
        Maxsize = maxsize ;
        stack = new int[maxsize];

    }
//是否空栈
    public boolean isFull(){
        return top==Maxsize-1;
    }
//是否满栈
    public boolean isEmpty(){
        return top==-1;
    }
//入栈
    public void InStack(int a ){
        //检验是否满
        if(isFull()){
            return;
        }

        top++;
        stack[top]=a;
    }
//出栈
    public void OutStack(int b){
        if(isEmpty()){
            throw new RuntimeException("栈为空");
        }
        b = stack[top];
        top--;
    }
//遍历栈
    public void Liststack(){
        for(int i=top;i>-1;i--){
            System.out.printf("stcak[%d]=%d",i,stack[i]);
            System.out.println();
        }
    }
}
