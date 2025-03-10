import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi bất kỳ: ");
        String input = scanner.nextLine();

        String normalizedInput = input.toLowerCase();
        StringBuilder sb = new StringBuilder(normalizedInput);
        String reversed = sb.reverse().toString();

        if (normalizedInput.equals(reversed)) {
            System.out.println("Chuỗi đối xứng.");
        } else {
            System.out.println("Chuỗi không đối xứng.");
        }

        scanner.close();
    }
}
