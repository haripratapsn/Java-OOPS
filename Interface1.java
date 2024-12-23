interface Father1{
    abstract void call();
    abstract void talk();
}
class Interface implements Father1{
    public void call(){
        System.out.println("Calling");
    }
    @Override
    public void talk() {
        System.out.println("Talking");
    }

    public static void main(String[] args){
    Interface ob=new Interface();
    ob.call();
    ob.talk();
    }
}













