package Chapter6;

/**
 * @ClassName: Four
 * @Description: 自定义异常
 * @author: h_xy
 * @date: 2020/11/28  15:26
 */
public class Four {
    static void level(int s ) throws Myexception{
        if(s>10){
            throw new Myexception("水位过高 ! ") ;
        }
        System.out.println("无异常");
    }

    public static void main(String[] args) {
        try{
            level(1);
            level(11);     //抛出异常后不会再继续工作

        }catch (Myexception e){
            System.out.println("捕获异常"+e);  //要写出异常的名字

        }

    }

}
class Myexception extends Exception{
    public Myexception(String s ){
        super(s);
    }
}
