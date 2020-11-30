package Chapter5;
/**
 * @ClassName: Second
 * @Description: 选择题评分
 * @author: h_xy
 * @date: 2020/11/27  18:53
 */
public class Second {
    public static void main(String[] args) {
        char[][] num ={
                {'A','B','D','A'},
                {'A','C','A','B'},
                {'B','B','B','B'},
                {'A','B','B','B'}
        };
        char answer[] ={'A','B','C','D'};
        int answers;
        for(int i=0;i<num.length;i++) {    //二维数组的长度
            answers = 0;
            for (int j = 0; j < num[i].length; j++) {  //一维数组的长度
                if (num[i][j] == answer[j]) {
                    answers++;
                }
            }
            System.out.println("第"+i+"个同学的正确数为："+answers);
        }
    }
}
