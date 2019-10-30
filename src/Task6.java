import java.io.*;

class InputStreamExample {

    public static void main(String args[]) throws IOException {
        FileInputStream input1 = new FileInputStream("stmth1.txt");
        FileInputStream input2 = new FileInputStream("stmth2.txt");
        SequenceInputStream inst = new SequenceInputStream(input1, input2);
        int i;
        while((i=inst.read())!=-1){
            System.out.print((char)i);
        }
        inst.close();
        input1.close();
        input2.close();
    }
}