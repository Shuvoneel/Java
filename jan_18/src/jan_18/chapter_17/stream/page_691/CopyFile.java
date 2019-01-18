package jan_18.chapter_17.stream.page_691;

import java.io.*;

public class CopyFile {

    public static void main(String[] args) throws IOException {

        try (
                BufferedInputStream input = new BufferedInputStream(new FileInputStream("shuvo.txt"));
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("copy.txt"));) {
            int r, num_of_Bytes_Copied = 0;
            while ((r = input.read()) != -1) {
                output.write((byte) r);
                num_of_Bytes_Copied++;
            }
            System.out.println(num_of_Bytes_Copied + " bytes copied");
        }
    }
}
