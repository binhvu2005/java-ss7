public class Bai6 {
    public static void main(String[] args) {
        int iterations = 1_000_000;

        // So sánh với String
        long startTime = System.currentTimeMillis();
        String str = "Hello";
        for (int i = 0; i < iterations; i++) {
            str += " World";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Thời gian thực thi với String: " + (endTime - startTime) + " ms");

        // So sánh với StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < iterations; i++) {
            sb.append(" World");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian thực thi với StringBuilder: " + (endTime - startTime) + " ms");

        // So sánh với StringBuffer
        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("Hello");
        for (int i = 0; i < iterations; i++) {
            sbf.append(" World");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian thực thi với StringBuffer: " + (endTime - startTime) + " ms");
    }
}