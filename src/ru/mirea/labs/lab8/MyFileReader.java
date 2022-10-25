package ru.mirea.labs.lab8;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
    public static void read(String path){
        try {
            FileReader fileReader =new FileReader(path);
            int c;
            while ((c = fileReader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch (IOException ignored){}
    }
}
