public class exceptional_handlingtwo {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch (ArithmeticException E){
            System.out.println("B is 0");
        }
        catch (Exception E){
            System.out.println("B is 0");
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("Hello");
    }
}
