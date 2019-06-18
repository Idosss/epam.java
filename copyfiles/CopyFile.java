package kz.epam.gabdollin.practice.copyfiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the file name you want to copy: ");
        File source = new File(scanner.nextLine());
        System.out.println("Please, enter the path: ");
        File sourceTwin = new File(scanner.nextLine());
        try {
            Files.copy(source.toPath(), sourceTwin.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(source.getName() + " Copied succesfully");

        }
}
