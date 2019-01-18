package jan_18.chapter_17.stream.page_681;

import java.io.*;

public class FileStream {

    public static void main(String[] args) throws IOException {
        try (
                FileOutputStream output = new FileOutputStream("shuvo.txt");) {
            for (int i = 1; i <= 10; i++) {
                output.write(i);
            }
        }

        try (
                FileInputStream input = new FileInputStream("shuvo.txt");) {
            int value;
            while ((value = input.read()) != -1) {
                System.out.print(value + " ");
            }
        }
    }
}
