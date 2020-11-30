package Chapter4;

/**
 * @ClassName: First
 * @Description:  继承
 * @author: h_xy
 * @date: 2020/11/27  16:44
 */
public class First {
    public static void main(String[] args) {
        Student t = new Student();
        Student h = new Student(15,"xiaohua",20);  //继承的用法
        t.sprint();
        t.pprint();
        h.pprint();
        h.sprint();

    }
}
class Person{
    private int age;
    private String name;
    public Person(int age,String name){
        this.age = age;
        this.name = name;
    }
    public Person(){
        this.age =20;
        this.name ="Person";
    }
    public void pprint(){
        System.out.println("Person :  "+name+"   "+age);
    }
}
class Student extends Person{
    private int age;
    private String name;
    private int classno;
    public Student(int age,String name,int classno){
        this.age =age;
        this.name =name;
        this.classno =classno;
    }
    public Student(){
        this.age =18;
        this.name ="Student";
        this.classno =16;
    }
    public void sprint(){
        System.out.println("Student : " + name +"   "+ age+"   " + classno );
    }
}
