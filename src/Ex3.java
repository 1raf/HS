import java.io.*;

public class Ex3 {
    public static void main(String args[]) throws FileNotFoundException {
        File file1 = new File("test.txt");
        Writer out1;
        PrintWriter output1 = new PrintWriter(file1);
        output1.println("Some text here.");
        output1.close();

        File file2 = new File("Test2.txt");
        Writer out2;
        PrintWriter output2 = new PrintWriter(file2);
        output2.println("Something special.");
        output2.close();

        try(FileInputStream fin= new FileInputStream("test.txt");
            FileOutputStream fout=new FileOutputStream("Test2.txt");
        ){
            byte[] a = new byte[fin.available()];
            fin.read(a);
            fout.write(a);

            String s = new String(a);
            for (byte t:a) {
                System.out.print((char) t);}
        }

        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}