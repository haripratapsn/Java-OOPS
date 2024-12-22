import java.lang.reflect.Constructor;

class Sample{
    int rollno;//Field
    int marks;
    Sample(int num,int mark){ //Default Constructor Parameterized Constructor
        System.out.println("This is a constructor");
        rollno=num;
        marks=mark;
    }
    void display(){
        System.out.println(rollno);
        System.out.println(marks);
    }
}
class construct{
    public static void main(String[] args) {

        Sample obj=new Sample(70,20);
        System.out.println(obj.rollno);
        System.out.println(obj.marks);

        Sample obj1=new Sample(7,50);
        obj1.display();
        obj1.display();
    }
}
