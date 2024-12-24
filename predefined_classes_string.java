public class predefined_classes_string {
    public static void main(String[] args) {
        String s="sad life";
        System.out.println(s.equals("sad life"));
        System.out.println(s.charAt(4));
        //Printing as a character array
        char[] si=s.toCharArray();
        System.out.println(si[1]);
        String f="5.99990";
        //Converting string to double
        System.out.println(Double.parseDouble(f));


    }
}
