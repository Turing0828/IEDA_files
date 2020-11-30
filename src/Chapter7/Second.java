package Chapter7;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @ClassName: Second
 * @Description: 在文件中读取内容，然后打印在屏幕上
 * @author: h_xy
 * @date: 2020/11/29  19:21
 */
public class Second {
    public static void main(String[] args)
    throws IOException {
        File file;
        FileInputStream in = new FileInputStream("E:\\test.txt");  //读取文件
        BufferedInputStream buff = new BufferedInputStream(in);  //buff存入文件内容
        byte[] a  =  new byte[1024];
        int b = buff.read(a);                    //读取buff中的文件内容然后写入a中；
        String str = new String(a,0,b);   //新定义一个字符串
        System.out.println(str);
    }

}
