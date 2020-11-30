package HomeWork;
import java.io.*;
/**
 * @ClassName: Four
 * @Description: 读取与写入数组
 * @author: h_xy
 * @date: 2020/11/30  18:33
 */
public class Four {
    public static void main(String[] args)
    throws IOException{
        FileOutputStream out  = new FileOutputStream("e:\\test.txt");
        DataOutputStream buff = new DataOutputStream(out);
        int[] num = {101,102,103,104,105};
        for(int i=0;i<num.length;i++){
            buff.writeInt(num[i]);
        }
        buff.close();
        FileInputStream in = new FileInputStream("e:\\test.txt");
        DataInputStream buffer  = new DataInputStream(in);
        int[] number = new int[1024];
        for(int j =num.length-1;j>=0;j--){
            number[j] = buffer.readInt();
        }
        for(int k =0;k<num.length;k++)
        {
            System.out.println("  "+number[k]);   //反向读取数组
        }



    }
}
