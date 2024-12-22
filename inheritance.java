class memory_animal{
    String parent_name="Animal";
    int nolegs=4;

    public static void eat(){
        System.out.println("I eat with mouth");
    }
    public static void walk(){
        System.out.println("I walk with 4 legs");
    }
}
class dog1 extends memory_animal{ //Inheritance
    String name="Dog";

    Boolean bark=true;
}
class main1{
    public static void main(String[] args) {
        dog1 obj=new dog1();
        System.out.println(obj.parent_name);//With the help of inheritance we are able to use the
                                             // parent classes fields inside the dog class object
        System.out.println(obj.nolegs);
        System.out.println(obj.name);
        System.out.println(obj.bark);
        obj.eat();
        obj.walk();
    }
}



