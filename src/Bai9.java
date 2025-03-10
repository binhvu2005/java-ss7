import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi cần nén: ");
        String input = scanner.nextLine();

        // Nén chuỗi
        String compressed = compressString(input);

        // In kết quả
        System.out.println("Chuỗi đã nén: " + compressed);

        scanner.close();
    }

    public static String compressString(String str) {
        if (str.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                sb.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        sb.append(str.charAt(str.length() - 1)).append(count);

        return sb.toString();
    }
}
