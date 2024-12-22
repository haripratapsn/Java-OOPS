class multilvlinheritance {
    public static void main(String[] args) {
        Daughter s1=new Daughter();
        System.out.println(s1.gender);
        s1.print();
    }
}
class GrandFather{
    char gender='M';
    void print(){
        System.out.println("Inherited from GrandParent Class");
    }
}
class Mother extends GrandFather{
    char gender ='F';//Method Overriding
}
class Daughter extends Mother{

}
