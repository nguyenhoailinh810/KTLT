package buoi5;

public class bai5_1 {

    // Phương thức getMax dùng để tìm giá trị lớn nhất giữa hai số nguyên a và b
    public static int getMax(int a, int b) {
        return (a > b) ? a : b;
    }

    // Phương thức getMin dùng để tìm giá trị nhỏ nhất giữa hai số nguyên a và b
    public static int getMin(int a, int b) {
        return (a < b) ? a : b;
    }

    // Phương thức main là điểm bắt đầu của chương trình
    public static void main(String[] args) {
        int a = 5;  // Giá trị của số nguyên a
        int b = 10; // Giá trị của số nguyên b

        // Tìm và in ra giá trị lớn nhất
        int max = getMax(a, b);
        System.out.println("Giá trị lớn nhất: " + max);

        // Tìm và in ra giá trị nhỏ nhất
        int min = getMin(a, b);
        System.out.println("Giá trị nhỏ nhất: " + min);
    }
}