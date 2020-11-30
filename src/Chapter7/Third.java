package Chapter7;
import java.io.*;
/**
 * @ClassName: Third
 * @Description: 文件内容的写入和输出
 * @author: h_xy
 * @date: 2020/11/29  19:48
 */
public class Third {
    public static void main(String[] args)
    throws IOException {
        FileOutputStream out = new FileOutputStream("E:\\test.txt"); //将内容写入这个文件中
        BufferedOutputStream buffer = new BufferedOutputStream(out);   //文件字节流
        String s = "I love hangzhou,I love you!";
        buffer.write(s.getBytes()); //写入文件
        buffer.flush();
        buffer.close();
        FileInputStream in = new FileInputStream("E:\\test.txt");
        BufferedInputStream buffer01 = new BufferedInputStream(in);
        byte[] a1 = new byte[1024];  // byte不用大写
        int b = buffer01.read(a1);
        String x  = new String(a1,0,b);
        buffer01.close();
        System.out.println(x);
    }
}
