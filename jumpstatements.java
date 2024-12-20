public class jumpstatements {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
            if(i==5){//jumping to this place in loop
                break;
            }
            System.out.print(i);
    }
        for(int i=1; i<=10; i++){
            if(i==5){
                continue;}//To not print only the number 5
            System.out.println(i);
        }
    }
}

