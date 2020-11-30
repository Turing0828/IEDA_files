package first;
class add{
    int x,y;
    public void  add(int x,int y){

        int z = x+y;
        System.out.println(z);
    }

}
class sub{

    int x,y;
    public void sub(int x,int y)
    {
        int z =x-y;
        System.out.println(z);
    }
}
public class Chapter01 {
    public static void main(String[] args)
    {
        int x = 5;
        int y = 3;
        add a =new add();
        sub b = new sub();
        a.add(x,y);
        b.sub(x,y);

    }
}
