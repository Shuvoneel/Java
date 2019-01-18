package jan_18.chapter_17.stream.page_686;

import java.io.*;

public class DataStream {

    public static void main(String[] args) throws IOException {
        try (
                DataOutputStream output = new DataOutputStream(new FileOutputStream("hasan.txt"));) {
            output.writeUTF("Mehedi");
            output.writeDouble(85.5);
            output.writeUTF("Hasan");
            output.writeDouble(185.5);
            output.writeUTF("Shuvo");
            output.writeDouble(105.25);
        }
        try (
                DataInputStream input = new DataInputStream(new FileInputStream("hasan.txt"));) {
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
        }
    }
}
