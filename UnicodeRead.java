import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnicodeRead {
      public static void main(String[] args) throws IOException {
      int t;
      String s;
      
      try {
        InputStreamReader reader = new InputStreamReader( new FileInputStream("YourFile.txt"), "UTF-16");
        BufferedReader bufReader = new BufferedReader(reader);
         // read() called after closed method 
        System.out.print("Characters are : "); 
        while((t=bufReader.read())!= -1) 
        { 
            // convert the integer tue to character 
            char r = (char)t; 
            System.out.print(r); 
        } 
        System.out.println();
      } catch (Exception e) {
         // print error
         System.out.print("The stream is already closed"+e);
      }    
   }
}
