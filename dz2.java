package dz2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

public class main {
    public static void main(String[] args) {

        // задание 1 про полиндром

        // пример строки "бла бла бла"
        checkPalindromeHelper("бла бла бла");

        // пример строки "мала каска аксакалам"
        checkPalindromeHelper("мала каска аксакалам");

        // задание 2 про большую строку
        // Напишите метод, который составит строку, состоящую из 100 повторений слова TEST
        // и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
        String myBigString = makeBigString();
        try {
            writeToFile("my_big_string.txt", myBigString);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static void writeToFile(String filename, String text) throws IOException {
        Path file = Paths.get(filename);
        Files.write(file, Collections.singleton(text), StandardCharsets.UTF_8);
    }

    private static String makeBigString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 100; i++) {
            sb.append("TEST");
        }
        return sb.toString();
    }

    private static boolean isPalindrome(String text) {
        StringBuilder reverse = new StringBuilder();
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        char[] plain = clean.toCharArray();
        for (int i = plain.length - 1; i >= 0; i--) {
            reverse.append(plain[i]);
        }
        return (reverse.toString()).equals(clean);
    }


    private static void checkPalindromeHelper(String text) {

        System.out.println("Строка \"" + text + "\"" + (isPalindrome(text) ? " отличный палиндром." : " не есть палиндром."));

    }

}
