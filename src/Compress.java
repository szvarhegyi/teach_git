import java.util.*;

public class Compress {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String textToCompress = in.next();
        int counter = 0;

        for(int i = 0; i < textToCompress.length(); i++) {

            do {
                counter++;
            } while (i+counter < textToCompress.length() && textToCompress.charAt(i) == textToCompress.charAt(i+counter));

            System.out.print(counter + "" + textToCompress.charAt(i));
            i += counter - 1;
            counter = 0;

        }

    }

}
