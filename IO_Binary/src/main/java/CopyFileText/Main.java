package CopyFileText;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập srouce: ");
        String sourceFile = sc.nextLine();
        System.out.println(" Nhập target: ");
        String targetFile = sc.nextLine();
        CopyFile copyFiles = new CopyFile();
        copyFiles.copyFile(sourceFile,targetFile);
    }
}
