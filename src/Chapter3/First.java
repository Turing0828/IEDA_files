package Chapter3;
import java.util.Calendar;
public class First {
    public static void main(String[] args) {
        Time t =new Time();
        String s =t.getTime();
        System.out.println(s);

    }
}
class Time{
    private  Calendar t;
    private int  year,month,day,hour,min,ss;
    Time(){
        t = Calendar.getInstance();    //  要令t等于得到的时间
        year = t.get(t.YEAR);
        month = t.get(t.MONTH)+1;
        day = t.get(t.DATE);
        hour = t.get(t.HOUR);
        min = t.get(t.MINUTE);
        ss = t.get(t.SECOND);
    }
    public String getTime(){
        String s = year +"年" +month +"月 "+day +"日"+hour +"时"+min+"分"+ss+"秒";
        return s;
    }
}
