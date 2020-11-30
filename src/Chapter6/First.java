package Chapter6;
import javax.imageio.IIOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.*;
import java.util.*;
/**
 * @ClassName: First
 * @Description:  抛出异常
 * @author: h_xy
 * @date: 2020/11/28  10:57
 */
public class First {
    public static void main(String[] args)
    throws FileNotFoundException, IOException {
            FileInputStream fis = new FileInputStream("text.txt");
            int b;
            while ((b = fis.read()) != -1) {
                System.out.println(b);
            }
            fis.close();
        System.out.println("程序正常结束");
    }
}
