abstract class Computer1{

    abstract void Turnoff();
    void Turnon(){
        System.out.println("Turning ON");
    }
}
class Hp1 extends Computer1{
    @Override
    void Turnoff() {
        System.out.println("Turning OFF HP");
    }
}
class Dell1 extends Computer1{
    @Override
    void Turnoff() {
        System.out.println("Turning OFF Dell");
    }
}

class abstract2{
    public static void main(String[] args) {
        Hp1 obj=new Hp1();
        obj.Turnoff();
        obj.Turnon();

        Dell1 obj2=new Dell1();
        obj2.Turnoff();
        obj2.Turnon();
    }
}