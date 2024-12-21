/*// To create class and object
class appform{
    String name;
    int rollno;

    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }

    public static void main(String[] args) {
        appform hari = new appform();
        hari.name="Hari";
        hari.rollno=21;
        hari.display();
    }
}
*/
// To set values in the function (Parameterized function) in class and creating more than one object in the class
class applform{
    String name;
    int rollno;

    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }
    public void setValues(String str, int num){
        name=str;
        rollno=num;
    }
}
class main{
    public static void main(String[] args) {
       //Does not use parameterized function
        applform kishore= new applform();
        kishore.name="pon";
        kishore.rollno=55;
        kishore.display();

        // Uses parameterized function
        applform hari =new applform();
        hari.setValues("hari",21);
        hari.display();
    }
}


