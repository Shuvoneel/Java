package jan_26.chapter_21.set.page_809;

import java.util.*;
import java.io.*;

public class CountKeywords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a java source file ");
        String fileName = input.nextLine();
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("The number of keywords in " + fileName + " is ");
        } else {
            System.out.println("File " + fileName + " does not exist ");
        }
    }

    public static int countKeywords(File file) throws Exception {
        String[] keywordString = {
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else", "enum", "extends", "for", "final", "finally",
            "float", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
            "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp",
            "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void",
            "volatile", "while", "true", "false", "null"
        };

        Set<String> keywordSet = new HashSet<>(Arrays.asList(keywordString));
        int count = 0;

        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            String word = input.next();
            if (keywordSet.contains(word)) {
                count++;
            }

        }
        return count;
    }
}
