public class Bai2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello, Java World!");
        System.out.println("Chuỗi ban đầu: " + sb);
        sb.delete(5, 9);
        System.out.println("Chuỗi sau khi xóa: " + sb);
        int start = sb.indexOf("World");
        if (start != -1) {
            sb.replace(start, start + 5, "Universe");
        }
        System.out.println("Chuỗi sau khi thay thế: " + sb);
    }
}