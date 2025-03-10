import java.util.Random;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập độ dài chuỗi ngẫu nhiên (1-1000): ");
        int n = scanner.nextInt();

        if (n < 1 || n > 1000) {
            System.out.println("Vui lòng nhập số trong khoảng 1 đến 1000.");
        } else {
            String randomString = generateRandomString(n);

            System.out.println("Chuỗi ngẫu nhiên: " + randomString);
        }

        scanner.close();
    }

    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }
}