package demo.workshop;

public class NhanVienTiepThi extends NhanVien {

    @Override
    double tinhLuong(XepLoai xepLoai) {
        return this.luongCoBan * getHeSoXepLoai(xepLoai);
    }

    private double getHeSoXepLoai(XepLoai xepLoai) {
        if (xepLoai.equals(XepLoai.A)) {
            return 1.5;
        } else if (xepLoai.equals(XepLoai.B)) {
            return 1.2;
        }

        return 1.0;
    }
}
