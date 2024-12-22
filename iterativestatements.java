public class iterativestatements {
    public static void main(String[] args) {
        //For Loop
        int n = 5;
        int sum = 0;
        int fact = 1;
        for (int i = 0; i < 1; i++) {
            System.out.println("Hari");
        }
        // Sum of n natural numbers
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of n number is:" + sum);

        //Task sum of n factorial numbers
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("factorial of n number is=" + fact);

        // While Loop
        // To print the sum of n numbers
        int i=1;
        while (i<=n){
            sum +=i;
            i++;
        }
        System.out.println("sum of n numbers is="+sum);

        // Do while Loop
        // To print the sum of n numbers
        do {
            sum = sum+i;
            i++;
        }while (i<=n);
        System.out.println("the sum of n numbers is="+sum);
    }
    }


