import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Javatut2
 */
public class Filing {

    public static void main(String[] args) {
       
       
        File f1 = new File("f1.log");
        try{
            if (f1.createNewFile()) {
                System.out.println("File created");
                f1.renameTo(new File("f1BU.log"));
                f1.delete();
            }
            else{
                System.out.println( "NOt created" );
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        //file in directory
        File d1 = new File("/");

        if(d1.isDirectory())
        {
            File [] files = d1.listFiles();
            for(File x: files)
            System.out.println(x.getName());
        }

        //file in tecxt
        File f2 = new File("f2.txt");

        try {
         PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f2)));
         pw.println("This is the sample text");
         pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        f2 = new File("f2.text");
        //Reading into a file
        try{
            BufferedReader br =new BufferedReader(new FileReader(f2));
            String text = br.readLine();
        }
        catch(IOException e){
            e.printStackTrace();
        }

        //Writing Binary data.
        File f3 =new File("f3.dat");

        FileOutputStream fos;
        try {
            fod = new FileOutputStream(f3);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            DataOutputStream dos = new DataOutputStream(bos);

            String name = "Avdol";
            int age = 20;

            dos.writeUTF(name);
            dos.writeInt(age);
            dos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        //For writing into binary file data
        f3 = new File("f3.dat");
        FileInputStream fis;
        try {
            fis = new FileInputStream(f3);
            BufferedInputStream bis =new BufferedInputStream(fis);
            DataInputStream dis = new DataInputStream(fis);
            System.out.println(dis.readUTF());
            System.out.println(dis.readInt());
        } catch (IOException e) {
            e.printStackTrace();
        
        }

    }
}