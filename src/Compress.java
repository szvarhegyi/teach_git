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
        //TODO: Misi please implement decompress method
        return "";
    }

    public static void main(String[] args) {

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


        System.out.println("\nAnother solutions:");

        //or without method call
        int counter = 0;
        String ret = "";
        for(int j = 0; j < textsToCompress.length; j++) {

           String textToCompress = textsToCompress[j];


            for(int i = 0; i < textToCompress.length(); i++) {
                do {
                    counter++;
                } while (i + counter < textToCompress.length() && textToCompress.charAt(i) == textToCompress.charAt(i + counter));

                ret += counter + "" + textToCompress.charAt(i);
                i += counter - 1;
                counter = 0;
            }

            System.out.println(ret);
            ret = "";

        }
    }

}
