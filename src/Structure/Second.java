package Structure;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
/**
 * @ClassName: Second
 * @Description: Queue 队列
 * @author: h_xy
 * @date: 2020/12/3  20:27
 */
public class Second {
    public static void main(String[] args)
    throws Exception{
        Queue queue = new Queue(6);
        Random num = new Random(101);
        Scanner in = new Scanner(System.in);
        boolean loand = true;
        while(loand) {
        System.out.println("F -检查是否为满");
        System.out.println("E -检查是否为空");
        System.out.println("A -添加数据");
        System.out.println("G -得到数据");
        System.out.println("S -打印队列 ");
        System.out.println("e -退出队列");
        System.out.println("请输入一个字符");
        // System.out.println();
        char a = in.next().charAt(0);
        switch (a) {
            case 'F':
                queue.isfull();
                break;
            case 'E':
                queue.isEmpty();
                break;
            case 'A':
                System.out.println("请添加一个数:");
                queue.addNum(num.nextInt(101));
                break;
            case 'G':
                try {
                    int sum = queue.getNum();
                    System.out.println(sum);
                } catch (Exception e) {
                }
                break;
            case 'S':
                queue.showArray();
                break;
            case 'e':
                in.close();
                loand = false;
                break;
            default:
                break;
        }

        }
    }
}
class Queue{
    private int Maxsize ;
    private int rear;
    private int front;
    private int[] array;
    public Queue(int maxsize){
        Maxsize = maxsize;
        array = new int[maxsize];  //不能重新定义数组
        rear =-1;
        front =-1;
    }
    public boolean isfull(){   //是否为满
        return rear == Maxsize-1;
         //return true;
    }
    public boolean isEmpty(){  //是否为空
        return front == rear;
       //return true;
    }
    public void addNum(int n){  //增加数据
        if(isfull()){
            System.out.println("数据已满");
            return;
        }
        rear++;
        array[rear] = n;
    }
    public int  getNum(){      //得到数据
        if(isEmpty()){
            //System.out.println("数据为空");
            throw  new  RuntimeException("出现错误");
        }
        front++;
        int n= front;
        return n;
    }
    public void showArray(){   // 显示数组
        for(int i=0;i<array.length;i++){
            System.out.printf("array[%d]=%d\t",i,array[i]);
        }
    }

}
