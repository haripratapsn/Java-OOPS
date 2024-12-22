public class recursive {
    public static void main(String[] args) {
        naty(10);
    }

    public static void naty(int n) {
        if (n > 0){
            naty(n-1);
            System.out.print(n);

        }
       }
    }
