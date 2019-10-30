import java.io.*;

public class Ex6 {
    public static void main(String[] args) throws IOException {

        File file1 = new File("stmth2.txt");
        Writer out1;
        PrintWriter output1 = new PrintWriter(file1);
        output1.println("Test text2");
        output1.close();

        File file2 = new File("stmth1.txt");
        Writer out2;
        PrintWriter output2 = new PrintWriter(file2);
        output2.println("Test text2");
        output2.close();

        PrintWriter pw = new PrintWriter("stmth2.txt");
        BufferedReader br = new BufferedReader(new FileReader("stmth1.txt"));
        String line = br.readLine();

        while (line != null){
            pw.println(line);
            line = br.readLine();
        }

        pw.flush();
        pw.close();

        System.out.println("Append stmth2.txt to stmth1.txt");
    }
}
