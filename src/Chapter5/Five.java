package Chapter5;

/**
 * @ClassName: Five
 * @Description: 统计电话号码中的数字的个数
 * @author: h_xy
 * @date: 2020/11/28  10:38
 */
public class Five {
    int[] Number(String Num[]) {
        int[] numberArray = new int[10];
        for (int i = 0; i < Num.length; i++) {
            for (int j = 0; j < Num[i].length(); j++) {
                numberArray[Num[i].charAt(j) - '0']++;
            }

        }
        return numberArray;
    }
}
