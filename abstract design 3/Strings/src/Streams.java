import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Streams {
    public static void main(String[] args)throws Exception{
        File f1=new File("streams.txt");
        f1.createNewFile();
        FileInputStream f=new FileInputStream("C:\\Users\\Anusha JM\\OneDrive\\Pictures\\img1.jpg");
        FileOutputStream f2=new FileOutputStream("streams.jpg");
       /* int a=f.read();
        while(a!=-1){
            f2.write(a);
            a=f.read();
        }
        */

      int a2=f.read();
        while(a2!=-1){
            System.out.println(a2);
           a2=f.read();
        }

    }
}
