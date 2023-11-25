package demo.workshop;

/**
 * Class đại diện cho nhân viên trưởng phòng trong hệ thống.
 * Kế thừa từ lớp NhanVien để có thể sử dụng các thuộc tính sẵn có.
 */
public class TruongPhong extends NhanVien {

    /**
     * Phương thức tính lương cho nhân viên trưởng phòng dựa trên xếp loại của họ.
     *
     * @param xepLoai Xếp loại của nhân viên trưởng phòng (A, B, hoặc C).
     * @return Lương của nhân viên trưởng phòng được tính dựa trên xếp loại.
     */
    @Override
    double tinhLuong(XepLoai xepLoai) {
        return this.luongCoBan * getHeSoXepLoai(xepLoai);
    }

    /**
     * Phương thức trả về hệ số xếp loại dựa trên xếp loại của nhân viên trưởng phòng.
     *
     * @param xepLoai Xếp loại của nhân viên trưởng phòng (A, B, hoặc C).
     * @return Hệ số xếp loại tương ứng với xếp loại của nhân viên trưởng phòng.
     */
    private double getHeSoXepLoai(XepLoai xepLoai) {
        if (XepLoai.A.equals(xepLoai)) {
            return 1.8;
        } else if (XepLoai.B.equals(xepLoai)) {
            return 1.5;
        }

        return 1.0;
    }
}
