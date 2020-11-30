package HomeWork;

/**
 * @ClassName: Second
 * @Description: TODO
 * @author: h_xy
 * @date: 2020/11/30  17:03
 */
public class Second {
    //2.编写一个Java程序实现多线程，在线程中输出线程的名字，隔300毫秒输出一次，共输出20次
    //MyThread t  = new MyThread();
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.run();
    }

}
class MyThread extends Thread{
    public void run(){

        for(int i= 0;i<20;i++){
            System.out.println(i+"  ");
            try{
                sleep(300);
            }catch (InterruptedException e){
                System.out.println("error"+ e);

            }
        }
    }
}
