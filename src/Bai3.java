import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi bất kỳ: ");
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();
        System.out.println("Chuỗi ban đầu: " + input);
        System.out.println("Chuỗi sau khi đảo ngược: " + reversed);

        scanner.close();
    }
}