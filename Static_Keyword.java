class Father4{
    static char gender='M';

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
    }

}


