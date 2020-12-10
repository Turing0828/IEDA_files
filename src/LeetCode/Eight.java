package LeetCode;

/**
 * @ClassName: Eight
 * @Description:  找钱问题  贪心算法+模拟
 * @author: h_xy
 * @date: 2020/12/10  19:34
 */
public class Eight {
    public static void main(String[] args) {
        int Five=0, Ten =0, Twtenty =0;
        String[] s  = {"5","5","5","20","10"};
        for(String a :s){
            if(a.equals("5")){
                Five++;
            }
            else if(a.equals("10")&&Five>0){
                Five--;
                Ten++;
            }
            else{
                if(Five>0&&Ten>0){
                    Five--;
                    Ten--;
                    Twtenty++;
                }
                else if(Five>=3){
                    Five = Five -3;
                    Twtenty ++;
                }
            }

        }
        System.out.printf("Five:%d,Ten:%d,Twtenty:%d",Five,Ten,Twtenty);
    }

}
