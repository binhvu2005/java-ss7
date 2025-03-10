import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder();

        System.out.print("Nhập chuỗi ban đầu: ");
        str.append(scanner.nextLine());

        while (true) {
            System.out.println("===== MENU QUẢN LÝ CHUỖI =====");
            System.out.println("1. Đảo ngược chuỗi");
            System.out.println("2. Chèn chuỗi vào vị trí bất kỳ");
            System.out.println("3. Xóa một đoạn trong chuỗi");
            System.out.println("4. Thay thế một đoạn trong chuỗi");
            System.out.println("5. Chuyển đổi toàn bộ chuỗi thành chữ hoa/chữ thường");
            System.out.println("6. Thoát chương trình");
            System.out.print("Chọn chức năng (1-6): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    str.reverse();
                    System.out.println("Chuỗi sau khi đảo ngược: " + str);
                    break;
                case 2:
                    System.out.print("Nhập chuỗi cần chèn: ");
                    String insertStr = scanner.nextLine();
                    System.out.print("Nhập vị trí chèn: ");
                    int insertPos = scanner.nextInt();
                    scanner.nextLine();
                    if (insertPos >= 0 && insertPos <= str.length()) {
                        str.insert(insertPos, insertStr);
                        System.out.println("Chuỗi sau khi chèn: " + str);
                    } else {
                        System.out.println("Vị trí không hợp lệ!");
                    }
                    break;
                case 3:
                    System.out.print("Nhập vị trí bắt đầu xóa: ");
                    int startDelete = scanner.nextInt();
                    System.out.print("Nhập vị trí kết thúc xóa: ");
                    int endDelete = scanner.nextInt();
                    scanner.nextLine();
                    if (startDelete >= 0 && endDelete <= str.length() && startDelete < endDelete) {
                        str.delete(startDelete, endDelete);
                        System.out.println("Chuỗi sau khi xóa: " + str);
                    } else {
                        System.out.println("Vị trí không hợp lệ!");
                    }
                    break;
                case 4:
                    System.out.print("Nhập vị trí bắt đầu thay thế: ");
                    int startReplace = scanner.nextInt();
                    System.out.print("Nhập vị trí kết thúc thay thế: ");
                    int endReplace = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập chuỗi thay thế: ");
                    String replaceStr = scanner.nextLine();
                    if (startReplace >= 0 && endReplace <= str.length() && startReplace < endReplace) {
                        str.replace(startReplace, endReplace, replaceStr);
                        System.out.println("Chuỗi sau khi thay thế: " + str);
                    } else {
                        System.out.println("Vị trí không hợp lệ!");
                    }
                    break;
                case 5:
                    System.out.print("Chọn 1 để chuyển thành chữ hoa, 2 để chuyển thành chữ thường: ");
                    int caseChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (caseChoice == 1) {
                        str = new StringBuilder(str.toString().toUpperCase());
                    } else if (caseChoice == 2) {
                        str = new StringBuilder(str.toString().toLowerCase());
                    } else {
                        System.out.println("Lựa chọn không hợp lệ!");
                    }
                    System.out.println("Chuỗi sau khi chuyển đổi: " + str);
                    break;
                case 6:
                    System.out.println("Thoát chương trình. Tạm biệt!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
            }
        }
    }
}