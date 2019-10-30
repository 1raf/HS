import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("from.txt");
             FileOutputStream fout = new FileOutputStream("to.txt");) {
            byte[] b = new byte[fin.available()];
            fin.read(b);
            fout.write(b);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}