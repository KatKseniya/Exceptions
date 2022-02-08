package exceptions;

public class FileSeparetor {

      public static String[] test (String [] arr) {

            for (int i = 0; i < arr.length; i++) {

                arr[i] = arr[i].trim().replaceAll("  "," ");
                String [] result;

                if (arr[i].contains("+")) {
                    result = arr[i].split(" ");

                    arr[i] += " = " + String.valueOf(Integer.parseInt(result[0]) + Integer.parseInt(result[2]));
                }

                if (arr[i].contains("-")) {
                    result = arr[i].split(" ");

                    arr[i] += " = " + String.valueOf(Integer.parseInt(result[0]) - Integer.parseInt(result[2]));
                }

                if (arr[i].contains("*")) {
                    result = arr[i].split(" ");

                    arr[i] += " = " + String.valueOf(Integer.parseInt(result[0]) * Integer.parseInt(result[2]));
                }

                if (arr[i].contains("/")) {
                    result = arr[i].split(" ");

                    if (Integer.parseInt(result[2]) !=0) {
                        arr[i] += " = " + String.valueOf(Integer.parseInt(result[0]) / Integer.parseInt(result[2]));
                    }
                    else {
                        arr[i] += " Делить на ноль нельзя";

                    }
                }
                System.out.println(arr[i]);
            }
            return  arr;
   }
}
