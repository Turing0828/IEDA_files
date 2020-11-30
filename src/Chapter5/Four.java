package Chapter5;
import java.util.Scanner;
/**
 * @ClassName: Four
 * @Description: 回文字符
 * @author: h_xy
 * @date: 2020/11/28  9:54
 */
public class Four {
    public static void main(String[] args) {
        String str  = null;
        System.out.println("请输入一个字符串:  ");
        Scanner in  = new Scanner(System.in);
        str = in.nextLine();
        if(isture(str)){
            System.out.println("字符为回文串！！！！");
        }
        else{
            System.out.println("字符不是回文串!!!");
        }

    }
    private static boolean isture(String check){
        int low = 0;
        int high = check.length() -1;
        while(low<high){
            if(check.charAt(low)!=check.charAt(high)){
                return  false;
            }
            low++;
            high--;
        }
        return true;


    }
}
