import java.awt.*;
import java.util.Date;
public class Data_type {
    public static void main(String[] args) {
        // Primitive Data Types
        int money=2000000000;
        System.out.println(money);
        byte age=127;
        System.out.println(age);
        short salary=32000;
        System.out.println(salary);
        long longestnumber=1000000000000000000L;
        System.out.println(longestnumber);
        float mark= 95.5f;
        System.out.println(mark);
        double percentage=62.88888888888;
        System.out.println(percentage);
        boolean presence=true;
        System.out.println(presence);
        char name='a';
        System.out.println(name);
        String channelname= "code";
        System.out.println(channelname);

        // Reference Data Type
        // 1.Date
        Date today= new Date();
        System.out.println(today);

        // 2.Points
        int a=10;//Example to show and understand Points DataType better where the data is allocated in RAM
        int b=a;
        a=5;
        System.out.println(a);
        System.out.println(b);

        Point p1=new Point(2,3);
        Point p2=p1;
        System.out.println(p2);
        p1.x=7;
        System.out.println(p1);
        System.out.println(p2); }}