public class hybrid_inheritance {
    public static void main(String[] args) {
        sson ss1=new sson();
        System.out.println(ss1.gender);
        ss1.print();

        ddaughter dd1=new ddaughter();
        System.out.println(dd1.gender);
        dd1.print();

        granddaughter gd=new granddaughter();
        System.out.println(gd.gender);
        gd.print();
        gd.display();
    }
}
class ffather{
    char gender='M';
    void print(){
        System.out.println("other traits are inherited from the father");
    }
    void display(){
        System.out.println("related to father");
    }
}
class sson extends ffather{
}
class ddaughter extends ffather{
    char gender ='F';//Method overriding
    }
class granddaughter extends ddaughter{
    void print(){//Method overriding
        System.out.println("grand daughter");
    }
}
