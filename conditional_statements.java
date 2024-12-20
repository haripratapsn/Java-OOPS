import javax.xml.transform.Source;

public class conditional_statements {
    public static void main(String[] args) {
        char attendence ='P';
        int total=40;

        if (attendence == 'P'){
            if(total >=50){
                System.out.println("attendend the class");}
        }
        else if (attendence == 'o'){
            System.out.println("on duty");
        }
        else {
            System.out.println("not attendend the class");
        }
        System.out.println("program ends");

        // Switch Case




    }
}
