
public class throwone {
    static void Handle(int age){
        if(age<18){
            throw new ArithmeticException("Invalid age");
        }
    }
    public static void main(String[] args) {
        try{
            Handle(17);
        }
        catch (ArithmeticException E){
            System.out.println(E.getMessage());
        }
        finally {
            System.out.println("catch is over");
        }
    }
}
