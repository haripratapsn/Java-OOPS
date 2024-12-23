abstract class Computer{
    void Turnon(){
        System.out.println("Turning On");
    }
}
class Hp extends Computer{

}
class Dell extends Computer{

}
class siuu {
public static void main(String[] args){
    Hp obj=new Hp();
    obj.Turnon();

    Dell obj1=new Dell();
    obj1.Turnon();
}
}