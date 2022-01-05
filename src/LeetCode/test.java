package LeetCode;

/**
 * @ClassName: test
 * @Description: 判断是否为字串
 * @author: h_xy
 * @date: 2021/1/6  20:13
 */
public class test {
    public static void main(String[] args) {
        String s = "abdsfkdkfjsd";
        String a = "fkk";
        boolean isture = true;
        int length = Math.max(s.length(),a.length());
        int min = Math.min(s.length(),a.length());
        for(int i=0;i<length-min;i++){
            if(s.substring(i,i+min).equals(a))
            {
                isture = false;
            }
        }
        if(isture){
            System.out.println("不存在相同的字符串");
        }
        else{
            System.out.println("存在相同的字符串");
        }


    }
}
