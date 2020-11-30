package HomeWork;

import java.io.*;
import java.util.Arrays;

/**
 * @ClassName: Third
 * @Description: TODO
 * @author: h_xy
 * @date: 2020/11/30  17:04
 */
public class Third {
    //编写一个Java程序将当100,101,102,103,104,105个数以数组的形式写入到Dest.txt文件中，并以相反的顺序读出显示在屏幕上
    public static void main(String[] args)
    throws IOException{
        FileOutputStream out = new FileOutputStream("e:\\test.txt");
        BufferedOutputStream buffer = new BufferedOutputStream(out);
        String[] s = {"101","102","103","104","105"};
        for(int i= 0;i<s.length;i++){
            buffer.write(s[i].getBytes());

        }
        buffer.flush();
        buffer.close();
        FileInputStream in =  new FileInputStream("e:\\test.txt");
        BufferedInputStream buff= new BufferedInputStream(in);
        byte[] b = new byte[1024];
        int length =buff.read(b);
        String c = new String(b,0,length);
        System.out.println(c);
    }
}
