import java.io.*;

public class Ex2 {
    public static void main(String[] args) throws IOException {
//        File file = new File("Ex2.txt");
//        Writer out;
//        PrintWriter output = new PrintWriter(file);
//        output.println("Some text here.");
//        output.close();

        try{
            FileInputStream fin=new FileInputStream("Ex1.txt");
            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}