package Decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class test {
    public static void main(String[] args) throws IOException {
        int c;
        String path = "C:\\Users\\Jonathan\\IdeaProjects\\head-first-designpatterns\\src\\Decorator\\io\\hola.txt";
        try{
            InputStream in = new LoweCaseInputStream(new BufferedInputStream(new FileInputStream(path)));
            while ((c = in.read()) >= 0){
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
