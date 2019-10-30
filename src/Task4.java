import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) {
        String str = "It's a shared string";
//        char[] ch = str.toCharArray();
        try (FileOutputStream fout = new FileOutputStream("stmth1.txt");
             FileOutputStream fout1 = new FileOutputStream("stmth2.txt");){

            fout.write(str.getBytes());
            fout1.write(str.getBytes());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}