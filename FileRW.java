
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class FileRW  {
    public static void main(String args[]) throws IOException{
        File fileName = new File("Jasir.txt");
        int line;
        try{
            FileReader fr = new FileReader(fileName);       
            BufferedReader br = new BufferedReader(fr);
            while((  line=br.read())!= -1 ){
                char r = (char)line; 
                System.out.print(r);
            }
            fr.close();
            System.out.println("Content of file : ");
            System.out.println(br.toString());
        }
        catch(FileNotFoundException ex){
            System.out.println("Error reading file " + ex );
        }
    }
}
