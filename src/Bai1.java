import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập 3 chuỗi từ người dùng
        System.out.print("Nhập chuỗi thứ nhất: ");
        String str1 = scanner.nextLine();

        System.out.print("Nhập chuỗi thứ hai: ");
        String str2 = scanner.nextLine();

        System.out.print("Nhập chuỗi thứ ba: ");
        String str3 = scanner.nextLine();

        // Tạo đối tượng StringBuilder và nối chuỗi
        StringBuilder sb = new StringBuilder();
        sb.append(str1).append(" ").append(str2).append(" ").append(str3);

        // Chuyển chuỗi thành chữ hoa
        String result = sb.toString().toUpperCase();

        // In kết quả
        System.out.println("Chuỗi sau khi nối và chuyển thành chữ hoa: " + result);

        // Đóng Scanner
        scanner.close();
    }
}
