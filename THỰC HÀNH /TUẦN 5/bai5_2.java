package buoi5;
public class bai5_2 {

    public static void main(String[] args) {
        viDu1();
        viDu2();
        viDu3();
        viDu4();
        viDu5();
        viDu6();
    }

    // Ví dụ 1: Minh họa toán tử tăng dần hậu tố và tiền tố
    public static void viDu1() {
        int a = 3;
        System.out.println("Ví dụ 1:");
        System.out.println("a++: " + a++);   // In ra giá trị của a rồi mới tăng a lên 1 (a = 4 sau lệnh này)
        System.out.println("++a: " + ++a);   // Tăng a lên 1 trước rồi mới in ra giá trị (a = 5 sau lệnh này)
        System.out.println("a++ + 1: " + (a++ + 1)); // Tăng a sau khi thực hiện phép cộng (a = 6 sau lệnh này)
        System.out.println("++a + 1: " + (++a + 1)); // Tăng a trước rồi mới cộng với 1 (a = 7 sau lệnh này)
    }

    // Ví dụ 2: Biến đổi giá trị với các toán tử hậu tố
    public static void viDu2() {
        int a = 0, b, c;
        System.out.println("Ví dụ 2:");
        a++;    // a = 1
        b = a;  // b = 1
        c = a++; // c = 1, sau đó a = 2
        System.out.println("a = " + a); // 2
        System.out.println("b = " + b); // 1
        System.out.println("c = " + c); // 1
    }

    // Ví dụ 3: Biến đổi giá trị với các toán tử tiền tố
    public static void viDu3() {
        int a = 0, b, c;
        System.out.println("Ví dụ 3:");
        ++a;    // a = 1
        b = a;  // b = 1
        c = ++a; // a tăng lên 2 trước khi gán cho c, c = 2
        System.out.println("a = " + a); // 2
        System.out.println("b = " + b); // 1
        System.out.println("c = " + c); // 2
    }

    // Ví dụ 4: Kết hợp toán tử tiền tố và hậu tố
    public static void viDu4() {
        int a = 0, b, c;
        System.out.println("Ví dụ 4:");
        ++a;    // a = 1
        b = ++a; // a tăng lên 2, sau đó gán cho b, b = 2
        c = a++; // c = 2, sau đó a tăng lên 3
        System.out.println("a = " + a); // 3
        System.out.println("b = " + b); // 2
        System.out.println("c = " + c); // 2
    }

    // Ví dụ 5: Sử dụng toán tử tiền tố và hậu tố trên nhiều biến
    public static void viDu5() {
        int a = 0, b, c;
        System.out.println("Ví dụ 5:");
        ++a;    // a = 1
        b = ++a; // a tăng lên 2 trước khi gán cho b, b = 2
        c = b++; // c = 2, sau đó b tăng lên 3
        System.out.println("a = " + a); // 2
        System.out.println("b = " + b); // 3
        System.out.println("c = " + c); // 2
    }

    // Ví dụ 6: Kết hợp toán tử tăng và phép cộng gán
    public static void viDu6() {
        int a = 0, b, c;
        System.out.println("Ví dụ 6:");
        ++a;    // a = 1
        b = a++; // b = 1, sau đó a tăng lên 2
        c = b++; // c = 1, sau đó b tăng lên 2
        c += c;  // c = c + c = 2
        System.out.println("a = " + a); // 2
        System.out.println("b = " + b); // 2
        System.out.println("c = " + c); // 2
    }
}