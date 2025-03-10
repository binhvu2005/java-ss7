import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi PascalCase hoặc camelCase: ");
        String input = scanner.nextLine();
        String result = convertToSnakeCase(input);
        System.out.println("Chuỗi chuyển đổi sang snake_case: " + result);

        scanner.close();
    }
    public static String convertToSnakeCase(String str) {
        if (str.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append('_');
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
