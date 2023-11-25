package demo.workshop;

public class NhanVienHanhChinh extends NhanVien {

    @Override
    double tinhLuong(XepLoai xepLoai) {
        return this.luongCoBan;
    }
}
