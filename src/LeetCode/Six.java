package LeetCode;

/**
 * @ClassName: Six
 * @Description:  下一个更大的元素
 * @author: h_xy
 * @date: 2020/12/9  20:04
 */
public class Six {
    public static void main(String[] args) {

    }

    //第一步:找到对应元素
    static int[] NUm(int[] a ,int[] b){
        int[] num =new int[a.length];
        for(int i=0;i<a.length;i++)
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    num[i] =j;
                }
            }
        return num;
    }
    //第二步 ： 比较是否有更大的元素

}
