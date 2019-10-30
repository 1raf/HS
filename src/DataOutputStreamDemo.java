import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo
{

    public static void main(String[] args) throws Exception
    {
        DataOutputStreamDemo dataOutputStreamDemo = new DataOutputStreamDemo();
        dataOutputStreamDemo.writePrimitiveData();
    }

    public void writePrimitiveData() throws IOException
    {
        DataOutputStream dataOutputStream = null;
        FileOutputStream fileOutputStream = null;
        try
        {
            fileOutputStream = new FileOutputStream("test.txt");
            dataOutputStream = new DataOutputStream(fileOutputStream);

            dataOutputStream.writeInt(65);
            dataOutputStream.writeBytes("S");
            dataOutputStream.writeDouble(7.5);
            dataOutputStream.writeBoolean(true);

            System.out.println("Success");
        }
        finally
        {
            if (dataOutputStream != null)
            {
                dataOutputStream.close();
            }
        }
    }
}