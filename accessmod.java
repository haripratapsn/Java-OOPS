class app{
    private String name;//Here the field is set to be private and can only be accessed inside this class
    protected int rollno;


    public void display(){
        System.out.println(name);//Now name is a get function
        System.out.println(rollno);
    }
    public void setValues(String str, int num){
        name=str;//Now name is set in another variable this is called set function
        rollno=num;
    }
    public String getValue(){//to return name filed inside the function this is get function
        return name;
    }
}
class notmain{
    public static void main(String[] args) {
        //Does not use parameterized function
        app kishore= new app();
        /*kishore.name="pon";//we cannot access private field directly*/
        kishore.rollno=55;
        kishore.display();//we can get the private field using get function

        // Uses parameterized function
        app hari =new app();
        hari.setValues("hari",21);//We can access private field through set function by only giving arguments
        hari.display();
        System.out.println(hari.getValue()+"=std2");//get function to get the name string from the class we can also manipulate the private field using this get function
    }
}
