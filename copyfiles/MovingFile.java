package src.kz.epam.gabdollin.practice.copyfiles;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class MovingFile {
    protected static void moveFile() {
        Scanner movePath = new Scanner(System.in);
        System.out.println("Please, enter the file name you want to move: ");
        Path source = Paths.get(movePath.nextLine());
        System.out.println("Please, enter the path: ");
        Path destination = Paths.get(movePath.nextLine());
        try {
            Files.move(source, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
