interface Father2{
    abstract void call();
    abstract void talk();
}
interface Mother2{
    abstract void call();
    abstract void talk();
}

class Son2 implements Father2,Mother2 {
    public void call(){
        System.out.println("calling");
    }
    public void talk(){
        System.out.println("Talking");
    }

    public static void main(String[] args) {
        Son2 ob=new Son2();
        ob.call();
        ob.talk();
    }
}
