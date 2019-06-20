package src.kz.epam.gabdollin.practice.copyfiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class DeletingFile {
    protected static void deleteFile(){
        Scanner deletePath = new Scanner(System.in);
        System.out.println("Please, enter the file path you want to delete: ");
        Path source = Paths.get(deletePath.nextLine());
        
        try {
            Files.delete(source);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
