import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class readingfile {
    public static void main(String[] args) {
        try{
        File f=new File("Example.txt");
        Scanner reader=new Scanner(f);
        while (reader.hasNextLine()){
            System.out.println(reader.nextLine());
        }
        }
        catch(FileNotFoundException E){
            System.out.println(E.getMessage());
        }
    }
}
