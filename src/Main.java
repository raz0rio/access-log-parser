import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int fileCount = 0;

        while (true) {
            System.out.print("Введите путь к файлу: ");
            String path = new Scanner(System.in).nextLine();

            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if (!fileExists || isDirectory) {
                System.out.println("Ошибка: файла не существует или это папка. Попробуйте снова.");
                System.out.println("");
                continue;
            }
            fileCount++;
            System.out.println("Путь указан верно. Это файл номер " + fileCount + ".");
            System.out.println("");
        }
    }
}
