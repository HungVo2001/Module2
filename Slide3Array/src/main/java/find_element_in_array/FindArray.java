package find_element_in_array;

import java.util.Scanner;

public class FindArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String [] studens = {"Hung","Dat","Huy","Hai","Long","Phuoc"};
        String input_name = sc.nextLine();
        boolean isExit = false;
        for (int i = 0; i < studens.length; i++) {
            if (studens[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is : " + i);
                isExit = true;
                break;
            }
        }
        if (!isExit) {
            System.out.println("Not found " + input_name + " in the lish ");
        }
    }
}
