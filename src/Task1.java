import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("something.txt");) {
            System.out.print((char)fin.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}