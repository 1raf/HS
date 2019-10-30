import java.io.*;
import java.util.ArrayList;

public class Ex5 {

    public static void main(String[] args) throws IOException {
        File file = new File("Ex5.txt");
        Writer out;
        PrintWriter output = new PrintWriter(file);
        output.close();

        ArrayList al = new ArrayList();
        al.add(65);
        al.add("S");
        al.add(7.5);
        al.add(true);

        try (BufferedWriter bw = new BufferedWriter (new FileWriter(file))) {
          {
            bw.write (al.toString());
          }
            bw.close ();

        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}