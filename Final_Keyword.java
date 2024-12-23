class Fatherr{
    final char gender='M';
    final void print(){
        System.out.println("This is Parent Class");
    }
}
class Daughterr extends Fatherr{
     /*gender='F';his shows error because the gender variable is a final variable so that it is finalised data and cannot be changed
        void print(){ // Same for the methods also if final keyword is used for the method then it cannot be overridden
         System.out.println("This is Child Class");
     }*/
}
public class Final_Keyword {
    public static void main(String[] args) {
        Daughterr d=new Daughterr();
        System.out.println(d.gender);
        d.print();
    }
}
