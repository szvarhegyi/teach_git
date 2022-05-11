import java.util.*;

public class Compress {

    public static String compress(String textToCompress) {
        int counter = 0;
        String ret = "";

        for(int i = 0; i < textToCompress.length(); i++) {
            do {
                counter++;
            } while (i + counter < textToCompress.length() && textToCompress.charAt(i) == textToCompress.charAt(i + counter));

            ret += counter + "" + textToCompress.charAt(i);
            i += counter - 1;
            counter = 0;
        }

        return ret;
    }

    public static String decompress(String compressedWord) {
        String ret = "";
        for (int i = 0; i < compressedWord.length(); i++) {

            String numbers = "";
            do {
                try {
                    Integer.parseInt(String.valueOf(compressedWord.charAt(i)));
                    numbers += compressedWord.charAt(i);
                    i++;
                } catch (NumberFormatException e) {
                    System.out.println(compressedWord.charAt(i) + " már nem konvertálható számmá");
                    break;
                }
            } while (true);

            for(int j = 0; j < Integer.parseInt(numbers);j++) {
                ret += compressedWord.charAt( i );
            }


        }

        return ret;
    }

    public static void main(String[] args) {
        /**
         Scanner in = new Scanner(System.in);
         String[] textsToCompress = in.nextLine().split("\\s");

         //First solution with for
         for(int i = 0; i < textsToCompress.length; i++) {
         System.out.print(compress(textsToCompress[i]) + " ");
         }
         System.out.println("\nAnother solutions:");
         //or other solution with foreach
         for (String word : textsToCompress) {
         System.out.print(compress(word) + " ");
         }
         */


        System.out.println("\nAnother solutions:");
        String[] decompress = {"10a20b"};

        for (String word : decompress) {
            System.out.print(decompress(word) + " ");
        }



    }

}
