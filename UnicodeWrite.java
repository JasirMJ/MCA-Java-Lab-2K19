import java.io.*;

public class UnicodeWrite {
   public static void main(String[] args) {
      try {    
         OutputStreamWriter writer = new OutputStreamWriter( new FileOutputStream("YourFile.txt"), "UTF-8");
         writer.write("Hi there! be kind for every one :  ");
         writer.flush();
         writer.close();
         System.out.println("Stream closed.");
         
      } catch (Exception ex) {
         ex.printStackTrace();
      }
   }
}
