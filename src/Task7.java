import java.io.*;

public class Task7{
    public static void main(String args[])throws Exception{
        FileOutputStream fout=new FileOutputStream("something.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);
        String s="Content that should be …ed.";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("Success");
    }
}