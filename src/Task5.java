import java.io.*;

class Task5{
    public static void main(String args[]) throws IOException
    {
        try ( DataOutputStream dout = new DataOutputStream(new FileOutputStream("something.txt")) ){
            dout.writeInt(65);
            dout.writeUTF("S");
            dout.writeDouble(7.1);
            dout.writeBoolean(true);
        }

        catch(FileNotFoundException ex){
            System.out.println("Cannot Open the Output File");
            return;
        }

        try (DataInputStream din = new DataInputStream(new FileInputStream("something.txt")) ){

            int a = din.readInt();
            String b = din.readUTF();
            double c = din.readDouble();
            boolean d = din.readBoolean();

            System.out.println(a + " " + b + " " + c+" " + d);
        }
        catch(FileNotFoundException e){
            System.out.println("Cannot Open the Input File");
            return;
        }
    }
} 
