package demo.workshop;

/**
 * Class đại diện cho nhân viên hành chính trong hệ thống.
 * Kế thừa từ lớp NhanVien để có thể sử dụng các thuộc tính sẵn có.
 */
public class NhanVienHanhChinh extends NhanVien {

    /**
     * Phương thức tính lương cho nhân viên hành chính mà không phụ thuộc xếp loại của họ.
     *
     * @return Lương cơ bản của nhân viên hành chính.
     */
    @Override
    double tinhLuong(XepLoai xepLoai) {
        return this.luongCoBan;
    }
}
