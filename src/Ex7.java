import java.io.*;

public class Ex7 {

    public static void main(String[] args) throws IOException {
        File file = new File("something.txt");
        Writer out;
        PrintWriter output = new PrintWriter(file);
        output.println("Some text here.");
        output.close();

        String[] fileNames = {"something.txt"};
        BufferedWriter writer = null;
        for(int i=0; i < fileNames.length; i++)
        {
            System.out.printf("%d\n", i);
            writer = new BufferedWriter(new FileWriter(fileNames[i]));
            writer.write("Content that should be …ed.");
            writer.close();
        }
    }
}