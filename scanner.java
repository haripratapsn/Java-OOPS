import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("enter the integer");
        int a = input.nextInt();
        System.out.println("Input="+a);
        System.out.println("Input a float");
        float e =input.nextFloat();
        System.out.println("Flaot="+e);
        System.out.println("Input a charater");
        char b=input.next().charAt(0);
        System.out.println("Char="+b);
        System.out.println("Input the String");
        String c=input.next();
        System.out.println("String="+c);
        System.out.println("Input a Sentence");
        String d=input.nextLine();
        System.out.println("Sentence="+d);
    }
}

