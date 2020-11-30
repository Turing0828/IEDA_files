package Chapter3;

/**
 * @ClassName: Five
 * @Description: 模拟贷款
 * @author: h_xy
 * @date: 2020/11/26  20:12
 */
public class Five {
    public static void main(String[] args) {
        Load t = new Load();
        t.setLoad(13,19098,0.21);
        System.out.println("总利息:  "+t.LoadMoney() +"   "+"还款总额:  "+t.totalMoney());
    }
}

class Load{
    private int month;  //贷款的月数
    private double money;  //贷款的金额
    private double monthRate;  //月率利
    public void setLoad(int month,double money,double monthRate){
        this.month = month;
        this.money = money;
        this.monthRate = monthRate;
    }
    public double  LoadMoney(){  //利息
       double total;
       total = money *monthRate;
       return total;
    }
    public double totalMoney(){
        double total1;
        total1 = money*monthRate +money;
        return total1;
    }
}
