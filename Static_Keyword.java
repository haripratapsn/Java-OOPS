class Father4{
    static char gender='M';
    static int age=50;
    static void print(){
        System.out.println("This is a Parent Class");
    }
}
class Daughter4 extends Father4{
    char gender='F';
    static void print(){
        System.out.println("This is child class");
    }
}
class Static{
    public static void main(String[] args){
        Daughter4 ob=new Daughter4();
        Father4.print();
        Daughter4.print();
        System.out.println(ob.gender);
        System.out.println(Father.gender);
        System.out.println(Father4.age);  //Here we are calling father static age
        Daughter4.age=18;                 //Now we can override the static age directly without creating any object
        System.out.println(Father4.age);  //Father age variable now stores the overridden age data
    }
}


