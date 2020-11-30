package Chapter3;
/**
 * @ClassName: Four
 * @Description: 一元二次方程的解析
 * @author: h_xy
 * @date: 2020/11/26  19:44
 */
public class Four {
    public static void main(String[] args) {
        Fc x = new Fc();
        x.setNumber(1.2,2.3,4.0);
        x.show_root();

    }
}
class Fc{
    private double x1,x2;
     private double a,b,c,delt;
     public void setNumber(double a,double b,double c){    //传入值
         this.a =a;
         this.b =b;
         this.c =c;
     }
     public void real_root(){
         x1= (-b+Math.sqrt(delt))/2*a;
         x2= (-b-Math.sqrt(delt))/2*a;
         System.out.println("delt>0存在实根");
         System.out.println("第一个根:"+x1+"第二个根："+x2);
     }
     public void vir_root(){
         x1 =-b/2*a;
         x2 =x1;
         System.out.println("delt<0无实根");
         System.out.println("两个根为："+x1);
     }
     public void show_root(){
         delt = b*b -4*a*c;
         if(delt>0){
             real_root();
         }
         else{
             vir_root();
         }

     }
}
