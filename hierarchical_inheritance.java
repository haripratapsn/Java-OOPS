class hierarchical_inheritance {
    public static void main(String[] args) {
        son1 s11 = new son1();
        System.out.println(s11.gender);
        s11.print();

        daughter1 d1 =new daughter1();
        System.out.println(d1.gender);
    }
}

class father1{
    char gender='M';
    void print() {
        System.out.println("This trait is inherited from father class");
    }
}
class son1 extends father1{
    char gender='M';//Method overriding
}
class daughter1 extends father1{
    char gender = 'F';//Method overriding
}
