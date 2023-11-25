package demo.workshop;

/**
 * Class đại diện cho nhân viên tiếp thị trong hệ thống.
 * Kế thừa từ lớp NhanVien để có thể sử dụng các thuộc tính sẵn có.
 */
public class NhanVienTiepThi extends NhanVien {

    /**
     * Phương thức tính lương cho nhân viên tiếp thị dựa trên xếp loại của họ.
     *
     * @param xepLoai Xếp loại của nhân viên tiếp thị (A, B, hoặc C).
     * @return Lương của nhân viên tiếp thị được tính dựa trên xếp loại.
     */
    @Override
    double tinhLuong(XepLoai xepLoai) {
        return this.luongCoBan * getHeSoXepLoai(xepLoai);
    }

    /**
     * Phương thức trả về hệ số xếp loại dựa trên xếp loại của nhân viên tiếp thị.
     *
     * @param xepLoai Xếp loại của nhân viên tiếp thị(A, B, hoặc C).
     * @return Hệ số xếp loại tương ứng với xếp loại của nhân viên tiếp thị.
     */
    private double getHeSoXepLoai(XepLoai xepLoai) {
        if (XepLoai.A.equals(xepLoai)) {
            return 1.5;
        } else if (XepLoai.B.equals(xepLoai)) {
            return 1.2;
        }

        return 1.0;
    }
}
