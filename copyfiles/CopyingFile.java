package src.kz.epam.gabdollin.practice.copyfiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class CopyingFile {
    protected static void copyFile() throws  IOException {

        Scanner copyPath = new Scanner(System.in);
        System.out.println("Please, enter the file name you want to copy: ");
        Path source = Paths.get(copyPath.nextLine());
        System.out.println("Please, enter the path: ");
        Path destination = Paths.get(copyPath.nextLine());
        Files.copy(source, destination);
    }
}
