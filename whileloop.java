public class whileloop {
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        int i=1;
      /*  while (i<=n){
            sum +=i;
            i++;
        }
        System.out.println("sum of n numbers is="+sum);

     */
        do {
            sum = sum+i;
            i++;
        }while (i<=n);
        System.out.println("the sum of n numbers is="+sum);
    }
}
