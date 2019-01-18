package jan_18.chapter_17.stream.page_687;

import java.io.*;

public class EndOfFile {

    public static void main(String[] args) throws IOException {
        try {
            try (
                    DataOutputStream output = new DataOutputStream(new FileOutputStream("test.txt"))) {
                output.writeDouble(4.5);
                output.writeDouble(43.25);
                output.writeDouble(3.2);
            }
            try (
                    DataInputStream input = new DataInputStream(new FileInputStream("test.txt"))) {
                while (true) {
                    System.out.println(input.readDouble());
                }
            }
        } catch (EOFException ex) {
            System.out.println("All data were read");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
