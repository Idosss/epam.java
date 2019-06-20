package src.kz.epam.gabdollin.practice.copyfiles;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CopyingFile.copyFile();
        MovingFile.moveFile();
        DeletingFile.deleteFile();

    }
}
