package workingWithFiles;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readFile();
        writeFile();
        readFile();
    }

    public static void createFile() {
        File file = new File("/Users/huseyin/IdeaProjects/java_Demos/src/files/students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya oluşturuldu.");
            } else
                System.out.println("Dosya zaten mevcut.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileİnfo() {
        File file = new File("/Users/huseyin/IdeaProjects/java_Demos/src/files/students.txt");
        if (file.exists()) {
            System.out.println("Dosya adı : " + file.getName());
            System.out.println("Dosya yolu : " + file.getAbsoluteFile());
            System.out.println("Dosya yazılabilir mi? : " + file.canRead());
            System.out.println("Dosya boyutu (byte) : " + file.length());
        }

    }

    public static void readFile() {
        File file = new File("/Users/huseyin/IdeaProjects/java_Demos/src/files/students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void writeFile(){
        try {
            BufferedWriter writer= new BufferedWriter(new FileWriter("/Users/huseyin/IdeaProjects/java_Demos/src/files/students.txt",true));
            writer.newLine();
            writer.write("Gökhan");
            System.out.println("Dosyaya yazıldı");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
