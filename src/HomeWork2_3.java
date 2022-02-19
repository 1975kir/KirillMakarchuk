import java.util.Scanner;

public class HomeWork2_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String name = console.nextLine();
        int count = 0;

        for (int i = 0; i <= name.length() - 1; i++) {
            if (Character.isUpperCase(name.charAt(i)) || name.matches("[a-zA-Z]")) {
                count++;}


        }
        if (count == 0) {
            System.out.println("В строке латинские символы нижнего регистра");
        } else {
            System.out.println("В строке латинские символы не только нижнего регистра");
        }
    }
}
