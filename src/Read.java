import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Read
{
    public static void main(String[] args) {
        read();
    }
    public static void read()
    {
        File file= null;
        FileInputStream f=null;
        ObjectInputStream o=null;
        try
        {
         file=new File("test.txt");
         f= new FileInputStream(file);
         o= new ObjectInputStream(f);

            System.out.println(o.readObject());
            o.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
