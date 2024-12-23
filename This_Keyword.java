class man{
    char gender;
    int age;

    void print(char gender, int age){
        this.gender=gender;
        this.age=age;
    }
}
public class This_Keyword {
    public static void main(String[] args) {
        man m=new man();
        m.print('m',50);
        System.out.println(m.gender);
        System.out.println(m.age);
    }
}
