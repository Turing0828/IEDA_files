package Chapter7;
import java.io.IOException;
/**
 * @ClassName: First
 * @Description:  文件输入，输出流
 * @author: h_xy
 * @date: 2020/11/29  18:53
 */
public class First {
    public static void main(String[] args)
    throws IOException{    // 抛出异常
        int b;
        System.out.println("请输入数据:");
        while((char)(b =System.in.read())!='N'){   //读取
            System.out.print((char)b);
        }
    }
}
