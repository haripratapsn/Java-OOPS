public class recursion {
    public static void main(String[] args) {
        naturalnum(10);
    }

    public static void naturalnum(int n) {
        //Base case: we know that the natural numbers starts with 1, so it will be considered as the last.
        if(n==1){
            System.out.print(1);
        }
        else{
            System.out.print(n);
            naturalnum(n-1);

        }

    }
}
