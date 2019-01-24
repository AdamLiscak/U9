import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Aufruf
{
    public static void main(String[] args)
    {
        Student a = new Student("Kim","Jong",32,1134,"Korea");
        Student b=  new Student("Heinz","Benz",23,12145,"German");
        Student c= new Student("Myong","Shyang",18,183976890,"China");
        Student d= new Student("Kim","Jackson",21,89169012,"USA");
        Student e= new Student("Dj","Tiesto", 43,828912, "German");
        ArrayList<Student> o=new ArrayList<>(5);
        o.add(a);o.add(b);o.add(c);o.add(d);o.add(e);
        File file = null;
        FileOutputStream m= null;
        ObjectOutputStream l= null;
        try {
            file= new File("test.txt");
            m= new FileOutputStream(file);
            l= new ObjectOutputStream(m);
            l.writeObject(o);
            l.close();
        }
        catch (Exception e1)
        {
            e1.printStackTrace();
        }
    }
}
