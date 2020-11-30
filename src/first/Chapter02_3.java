package first;
import java.util.Scanner;
public class Chapter02_3 {
    public static void main(String[] args){
        //加密与解密
        System.out.println("加密与解密");
        Scanner in = new Scanner(System.in);
        System.out.println("输入的原始密码为：");
        String PassWord = in.nextLine();
        //转化为字符数组
        char[] Word = PassWord.toCharArray();
        char M ='x';
        System.out.println("密文:   ");
        for(int i =0;i< Word.length;i++){
            Word[i]  =(char)(Word[i]^M);  //要打上夸号
            System.out.print(Word[i]);
        }
        System.out.println("    ");
       // System.out.println("解密");
        System.out.println(  "明文:  ");
        for(int i = 0;i<Word.length;i++){
            Word[i] =(char)(Word[i]^M);
            System.out.print(Word[i]);
        }
    }
}
