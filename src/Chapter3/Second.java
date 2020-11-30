package Chapter3;
public class Second {
    public static void main(String[] args) {
        area a = new area();
        area b = new area();
        a.CFX(3.0,3.4);
        b.YX(3.0);
        System.out.println("长方形的面积为: "+a.area1()+"   "+"圆形的面积为:  "+b.area2());
    }
}
class area{
    private double x,y;
    private double r;
    final double PI = 3.14;
    public void CFX(double x,double y){
        this.x = x;   //传值
        this.y = y;
    }
    public void YX(double r){
        this.r = r;
    }
    public double area1(){
        return x*y;
    }
    public double area2(){
        return PI*r*r;
    }
}
