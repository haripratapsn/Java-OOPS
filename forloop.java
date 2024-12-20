import java.sql.PseudoColumnUsage;

public class forloop {
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        int fact=1;
        for (int i=0; i<1; i++){
            System.out.println("Hari");
        }
        // Sum of n natural numbers
        for (int i=1; i<=n; i++){
            sum = sum + i;
            System.out.println(sum);
        }
        System.out.println("Sum of n number is:"+sum);

        //Task sum of n factorial numbers
        for (int i=1; i<=n; i++ ){
            fact *= i;
            System.out.println(fact);
        }
        System.out.println("factorial of n number is="+fact);

        }
    }

