package exceptions;

import java.io.*;

public class File_Writer {

    public static void write (String [] arr) {

          try(FileWriter writer = new FileWriter("/C:/Users/Kseniya_Katselnikava/Desktop/test_result.txt", false))
          {
              for (int i = 0; i < arr.length; i++){
                  writer.write(arr[i]);
                  writer.append('\n');
              }
          }
          catch(IOException ex){
              System.out.println(ex.getMessage());
          }
      }
}
