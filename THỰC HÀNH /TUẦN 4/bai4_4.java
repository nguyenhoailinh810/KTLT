package buoi4;

public class bai4_4 {

    // Phương thức bai4_4 dùng để in ra từng phần tử trong mảng hai chiều arr2
    public static void bai4_4() {
        // Khởi tạo mảng arr2 với kích thước không đồng đều
        int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7 } };
        
        // Sử dụng biến đếm để in ra thứ tự của từng phần tử
        int elementNumber = 1;

        // Sử dụng vòng lặp for lồng nhau để duyệt qua từng phần tử của mảng hai chiều arr2
        for (int i = 0; i < arr2.length; i++) {          // Vòng lặp hàng
            for (int j = 0; j < arr2[i].length; j++) {   // Vòng lặp cột (trong từng hàng)
                System.out.printf("Phần tử thứ %d arr2[%d][%d] = %d%n", elementNumber++, i, j, arr2[i][j]);
            }
        }
    }
    
    // Phương thức main là điểm bắt đầu của chương trình
    public static void main(String[] args) {
        // Gọi phương thức bai4_4 để thực hiện việc in ra các phần tử của mảng arr2
        bai4_4();
    }
}