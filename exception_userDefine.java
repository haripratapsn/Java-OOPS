class UserDefined extends Exception{
    UserDefined(String msg){
        super(msg);
    }
}
public class exception_userDefine {
    static void Handle(int age)throws UserDefined,ArithmeticException{
        if(age<18){
            throw new UserDefined("Age Invalid");
        }
        else {
            throw new ArithmeticException("Age Valid");
        }
    }
    public static void main(String[] args) {
     try{
         Handle(17);
     }
     catch (UserDefined E) {
         System.out.println(E.getMessage());
     }
     catch (ArithmeticException E){
         System.out.println(E.getMessage());
     }
    }
}
