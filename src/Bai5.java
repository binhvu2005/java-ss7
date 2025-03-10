import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một câu: ");
        String input = scanner.nextLine().trim();
        String[] words = input.split("\\s+");

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            result.append(reversedWord).append(" ");
        }

        System.out.println("Câu sau khi xử lý: " + result.toString().trim());

        scanner.close();
    }
}