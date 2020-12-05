package Chapter7;
/**
 * @ClassName: Four
 * @Description:  多线程
 * @author: h_xy
 * @date: 2020/12/1  19:07
 */
public class Four {
    public static void main(String[] args) {
        DomeThread t1 =  new DomeThread();
        DomeThread t2 =  new DomeThread();
        t1.run();
        t2.run();
    }
}
class DomeThread extends Thread{
    public void run(){

        for(int i = 0;i<20;i++){
            System.out.println(this.getName()+"第"+i +"次");
        }
        try{
            sleep(300);
        }catch(InterruptedException e ){
            System.out.println("出现异常"+e);
        }
    }
}
