package demo.workshop;

public class TruongPhong extends NhanVien {

    @Override
    double tinhLuong(XepLoai xepLoai) {
        return this.luongCoBan * getHeSoXepLoai(xepLoai);
    }

    private double getHeSoXepLoai(XepLoai xepLoai) {
        if (xepLoai.equals(XepLoai.A)) {
            return 1.8;
        } else if (xepLoai.equals(XepLoai.B)) {
            return 1.5;
        }

        return 1.0;
    }
}
