package exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadFileLineByLine {

    public static String[] arr () {
        String [] result = null;
        try {
            File file = new File("/C:/Users/Kseniya_Katselnikava/Desktop/file.txt");

            FileReader fr = new FileReader(file);

            BufferedReader reader = new BufferedReader(fr);

            String line = "";

            List <String> arr = new ArrayList<String>();
            while (line != null) {

                line = reader.readLine();
                arr.add(line);
            }

            arr.removeAll(Collections.singleton(null));
            result = new String[arr.size()];

            for (int i=0;i<arr.size();i++){
                result [i] = arr.get(i);
                }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}