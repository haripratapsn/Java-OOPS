public class exceptional_handling {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
        System.out.println(a/b);//We know this line has Arithmetic Exception error so we put it in try
        }
        catch(ArithmeticException E){//ArithmeticException is a class and an object is created "E" throw the ArithmeticalException and run the rest of the program
            System.out.println("b is 0");
        }
        System.out.println("hello");//Now this line of the code is printed without any error
    }


}
