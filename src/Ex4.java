import java.io.*;

public class Ex4 {

    public static void main(String[] args) throws IOException {
        File file1 = new File("File1.txt");
        Writer out1;
        PrintWriter output1 = new PrintWriter(file1);
        output1.println("Some text here.");
        output1.close();

        File file2 = new File("File2.txt");
        Writer out2;
        PrintWriter output2 = new PrintWriter(file2);
        output2.println("Something special.");
        output2.close();

        String[] fileNames = {"File1.txt","File2.txt"};
        BufferedWriter writer = null;
        for(int i=0; i<fileNames.length; i++)
        {
            System.out.printf("%d\n", i);
            writer = new BufferedWriter(new FileWriter(fileNames[i]));
            writer.write("I’m a shared string");
            writer.close();
        }
    }
}