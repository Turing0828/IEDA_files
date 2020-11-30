package Chapter4;

/**
 * @ClassName: Second
 * @Description:  学生管理系统
 * @author: h_xy
 * @date: 2020/11/27  17:05
 */
public class Second{
    public static void main(String[] args) {
        studentManger stu = new studentManger();
        Bigstudent s =new Bigstudent();
        stu.addstudent( s);
        Yanstudent s1 =new Yanstudent();
        stu.delectstudent(s);
        stu.addstudent(s1);
        stu.delectstudent(s1);
    }
}
abstract class student{  //创建一个抽象类
    private int age;
    private String name;
    abstract void login();   //定义抽象方法
    abstract  void delect();    //定义抽象方法
}
class Bigstudent extends student{   //继承抽象类
    private  int age;
    private String name;
    public void login(){
        System.out.println("大学生注册成功 !!!");
    }
    public void delect(){
        System.out.println("大学生删除成功 !!!");
    }
}
class Yanstudent extends student{   //继承抽象类
    private  int age;
    private String name;
    public void login(){
        System.out.println("研究生注册成功 !!!");
    }
    public void delect(){
        System.out.println("研究生删除成功 !!!");
    }
}
  class studentManger{
    public void  addstudent(student s){
        s.login();
    }
    public void delectstudent(student s){
        s.delect();
    }
  }

