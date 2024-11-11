package buoi4;

public class bai4_3 {

    // Phương thức bai4_3 dùng để in ra từng phần tử trong mảng hai chiều arr1 theo thứ tự
    public static void bai4_3() {
        // Khởi tạo mảng arr1 với kích thước 2 hàng và 3 cột
        int[][] arr1 = new int[2][3];
        
        // Sử dụng biến đếm để in ra thứ tự của từng phần tử
        int elementNumber = 1;

        // Sử dụng vòng lặp for lồng nhau để duyệt qua từng phần tử của mảng hai chiều arr1
        for (int i = 0; i < arr1.length; i++) {        // Vòng lặp hàng
            for (int j = 0; j < arr1[i].length; j++) { // Vòng lặp cột
                System.out.printf("Phần tử thứ %d arr1[%d][%d]%n", elementNumber++, i, j);
            }
        }
    }
    
    // Phương thức main là điểm bắt đầu của chương trình
    public static void main(String[] args) {
        // Gọi phương thức bai4_3 để thực hiện việc in ra các phần tử của mảng arr1
        bai4_3();
    }
}