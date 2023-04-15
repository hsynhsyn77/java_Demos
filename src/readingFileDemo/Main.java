package readingFileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        BufferedReader reader = null;

        int total = 0;
        try {
            reader = new BufferedReader(new FileReader("/Users/huseyin/IdeaProjects/java_Demos/src/readingFileDemo/sayilar"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                total += Integer.valueOf(line);
            }
            System.out.println("Toplam :" + total);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (Exception exception) {

            }

        }

    }
}
