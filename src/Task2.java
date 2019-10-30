import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("something.txt");) {
            byte[] b = new byte[fin.available()];
            fin.read(b);
            for (byte t : b) {
                System.out.print((char)t);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}