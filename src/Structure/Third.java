package Structure;
/**
 * @ClassName: Third
 * @Description: 链表
 * @author: h_xy
 * @date: 2020/12/4  21:18
 */
public class Third{
    public static void main(String[] args){
        //创建新的节点
        heroNode hero1 = new heroNode(1,"宋江","及时雨");
        heroNode hero2 = new heroNode(2," 李逵","黑旋风");
        heroNode hero3 = new heroNode(3,"阮小七","浪里白条");
        //建链表
        singleNOde biao = new singleNOde();
        biao.addNode(hero1);
        biao.addNode(hero2);
        biao.addNode(hero3);
        //打印链表
        biao.List();
    }
}

//1.创建节点类
class heroNode{
    public int no ;
    public String name;
    public String nickname;
    public heroNode next;
    public heroNode(int no ,String name,String nickname){
        this.no = no ;
        this.name = name;
        this.nickname = nickname;
    }
    public String toString(){
        return "heroNode[no ="+no+",name = "+name+",nickname ="+nickname+"]";
    }
}
//2.创建单链表

class singleNOde{
    //1.先建头节点
    private heroNode head  =  new heroNode(0,"","");
    //2.添加元素的方法
    public void addNode(heroNode node){
        heroNode temp = head;
        while(true){
            if(temp.next==null){
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
    }


    //3.遍历
    public void List(){
        if(head.next == null){
            return;
        }
        heroNode temp  = head.next;
        while(true){
            if(temp==null){
                break;
            }
            System.out.println(temp);
            temp =temp.next;
        }
    }
}
