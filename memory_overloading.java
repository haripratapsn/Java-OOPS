class animal{
    String name="Animal"; //Now the name variable is store with string "Animal"
    int nolegs=4;

    public static void eat(){
        System.out.println("I eat with mouth");
    }
    public static void walk(){
        System.out.println("I walk with 4 legs");
    }
}
class dog extends animal{ //Inheritance
    String name="Dog"; //Here the name variable is feeded with string "Dog"
    Boolean bark=true;
    public static void eat(){
        System.out.println("Dog is eating");
    }
}
class main12{
    public static void main(String[] args) {
        dog obj=new dog();
        System.out.println(obj.name);//The new name form dog class will only be printed not the inherited name due to memory overloading
        System.out.println(obj.nolegs);
        System.out.println(obj.bark);
        obj.eat();// The memory is overloaded in the memory in dog class
        obj.walk();


    }
}



