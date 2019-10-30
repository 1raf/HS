import java.io.*;

public class Ex1 {
    public static void main(String args[]) throws FileNotFoundException {

        File file = new File("Ex1.txt");
        Writer out;
        PrintWriter output = new PrintWriter(file);
        output.println("Some text here.");
        output.close();

        try{
            FileInputStream fin = new FileInputStream("Ex1.txt");
            int i=fin.read();
            fin.close();
            System.out.print((char)i);

        }catch(Exception e){System.out.println(e);}

    }
}