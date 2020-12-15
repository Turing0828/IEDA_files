package Charpter2;

import java.util.Scanner;

/**
 * @ClassName: First
 * @Description:  文件加密
 * @author: h_xy
 * @date: 2020/12/15  19:21
 */
public class First {
    public static void main(String[] args) {
        //输入一段文章
        System.out.println("请输入要加密的内容 ：");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] str = s.toCharArray();
        char scress = 'x';
        System.out.println("未加密的内容为 ： "+s);
        System.out.println();

        //将文章转化为字符数组
        System.out.println("加密后的内容:");
        for(int i =0; i<s.length() ;i++){
             str[i] =(char) (str[i] ^ scress);
            System.out.print( str[i]);
        }

        //用for和异或进行加密
        System.out.println();
        System.out.println("解密后的内容 : ");
        for(int j= 0 ;j<s.length() ;j++){
            str[j] =(char) (str[j] ^scress);
            System.out.print(str[j]);
        }
        //用for和异或进行解密
    }
}
