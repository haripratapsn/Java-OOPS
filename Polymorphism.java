class Polymorphism{
    public static void main(String[] args) {
        Methods obj21= new Methods();
        obj21.display(2);//This is method overriding
        obj21.display();

    }
}
class Methods{
    void display(){
        System.out.println("This is a void function");
    }
    void display(int a){
        System.out.println(a);
    }
}