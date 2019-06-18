package kz.epam.gabdollin.practice.morse;

import java.io.*;
import java.util.Arrays;

class MorseCode {

    static String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
            "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
            "9", "0", "!", ",", "?", ".", "'"};
    static String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----.", "-----", "-.-.--", "--..--", "..--..", ".-.-.-", ".----.",};

    public static String decode(String morseCode) {
        String build = "";
        String change = morseCode.trim();
        String[] words = change.split("   ");
        for (String word : words) {
            for (String letter : word.split(" ")) {
                for (int x = 0; x < morse.length; x++) {
                    if (letter.equals(morse[x]))
                        build = build + alpha[x];
                }
            }
            build += " ";
        }

        return build.toUpperCase();
    }

    public static String decodeEnglish(String englishCode) {
        String build = "";
        String change = englishCode.trim();
        String[] words = change.split(" ");
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                for (int x = 0; x < morse.length; x++) {
                    if (word.substring(i, i++).equalsIgnoreCase(alpha[x])) {
                        build = build + morse[x] + " ";
                    }
                }
            }
            build += "  ";
        }

        return build;
    }

    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader("C:\\Users\\aidos.gabdollin\\Desktop\\документы\\Java\\src\\com\\epam\\project\\Input.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                try (FileWriter fileWriter = new FileWriter("C:\\Users\\aidos.gabdollin\\Desktop\\документы\\Java\\src\\com\\epam\\project\\Output.txt");
                     BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                     bufferedWriter.write(decode(line));


                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}