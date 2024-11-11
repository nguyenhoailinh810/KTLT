package buoi4;

public class bai4_2 {
    
    // Phương thức bai4_2 dùng để in ra từng phần tử trong mảng nguHanh theo thứ tự.
    public static void bai4_2 () {
        // Khởi tạo mảng nguHanh với 5 phần tử là các yếu tố của ngũ hành
        String[] nguHanh = { "kim", "mộc", "thủy", "hỏa", "thổ" };
        
        // Biến cs (chỉ số) được sử dụng để theo dõi vị trí của phần tử trong mảng
        int cs = 0;

        // In ra từng phần tử trong mảng theo thứ tự, với định dạng yêu cầu
        System.out.printf("Phần tử thứ nhất nguHanh[%d] = %s%n", cs, nguHanh[cs++]);
        System.out.printf("Phần tử thứ hai nguHanh[%d] = %s%n", cs, nguHanh[cs++]);
        System.out.printf("Phần tử thứ ba nguHanh[%d] = %s%n", cs, nguHanh[cs++]);
        System.out.printf("Phần tử thứ tư nguHanh[%d] = %s%n", cs, nguHanh[cs++]);
        System.out.printf("Phần tử thứ năm nguHanh[%d] = %s%n", cs, nguHanh[cs++]);
    }

    // Phương thức main là điểm bắt đầu của chương trình
    public static void main(String[] args) {
        // Gọi phương thức bai4_2 để thực hiện việc in ra các phần tử của mảng nguHanh
        bai4_2();
    }
}