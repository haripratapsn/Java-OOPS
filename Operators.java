public class Operators {
    public static void main(String[] args) {
        int a=30;
        int b=20;

        // Arithmetic operators
        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a/b;
        int g=a%b;

        // Implicit Conversion Operators
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        // Explicit Conversion of float using Type Casting
        float h=(float) a/(float) b;
        System.out.println(h);

        // Post Increment and Post Decrement
        System.out.println(a++);
        System.out.println(a);
        System.out.println(a--);
        System.out.println(a);

        // Pre Increment and Pre Decrement
        System.out.println(++a);
        System.out.println(a);
        System.out.println(--a);
        System.out.println(a);

        // Relational Operator
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b );
        // Logical Operators
        System.out.println("Not Operators");
        boolean i=true;
        boolean j=false;
        //not operator
        System.out.println(!i);
        System.out.println(!j);
        //Or operator
        System.out.println("or Operators");
        System.out.println(i || j);
        //and operator
        System.out.println("and Operators");
        System.out.println(i && j);

    }
}
