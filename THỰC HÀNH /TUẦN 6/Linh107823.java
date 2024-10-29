package buoi6;

public class Linh107823 {
    public static void main(String[] args) {
        // Trường hợp 1: Dữ liệu ban đầu là chuỗi (String)
        System.out.println("-----THÔNG TIN SINH VIÊN - TRƯỜNG HỢP 1-----");
        String hoTen1 = "Nguyễn Hoài Linh";
        String ngaySinh1 = "25/10/2006";
        String diemTongKet1 = "7.9";
        String tuoi1 = "18";

        // Chuyển đổi kiểu dữ liệu
        float diemTongKetFloat = Float.parseFloat(diemTongKet1);
        int tuoiInt = Integer.parseInt(tuoi1);

        // Hiển thị kết quả
        System.out.println("Họ và tên: " + hoTen1 + " (String)");
        System.out.println("Ngày sinh: " + ngaySinh1 + " (String)");
        System.out.println("Tổng điểm: " + diemTongKetFloat + " (Float)");
        System.out.println("Tuổi: " + tuoiInt + " (Int)");
        System.out.println("-----HẾT-----\n");

        // Trường hợp 2: Dữ liệu ban đầu là kiểu phù hợp
        System.out.println("-----THÔNG TIN SINH VIÊN - TRƯỜNG HỢP 2-----");
        String hoTen2 = "Nguyễn Hoài linh";
        String ngaySinh2 = "25/10/2006";
        float diemTongKet2 = 7.9f;
        int tuoi2 = 18;

        // Chuyển đổi kiểu dữ liệu
        String diemTongKetStr = Float.toString(diemTongKet2);
        String tuoiStr = Integer.toString(tuoi2);

        // Hiển thị kết quả
        System.out.println("Họ và tên: " + hoTen2 + " (String)");
        System.out.println("Ngày sinh: " + ngaySinh2 + " (String)");
        System.out.println("Tổng điểm: " + diemTongKetStr + " (String)");
        System.out.println("Tuổi: " + tuoiStr + " (String)");
        System.out.println("-----HẾT-----");
    }
}