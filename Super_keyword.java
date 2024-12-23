class father11{
    char gender='M';
    void print(){
        System.out.println("This is parent class");
    }
}
class daughter11 extends father11{
    char gender='f';
    @Override
    void print() {
        System.out.println("This is child class method");
        super.print();
        System.out.println(super.gender);
    }
}
public class Super_keyword {
    public static void main(String[] args) {
        daughter11 d=new daughter11();
        System.out.println(d.gender);
        d.print();
    }
}
