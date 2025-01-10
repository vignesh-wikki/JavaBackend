package Day12.JavaIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOExample {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/vignesh/Downloads/JavaBackend/Day12/JavaIO/name.txt");
        if (file.createNewFile())
            System.out.println("File created");
        else
            System.out.println("File not created");

        FileWriter writer = new FileWriter(file);
        writer.write("Hey, hi I am Vignesh");
        writer.flush();
        writer.close();
    }
}
