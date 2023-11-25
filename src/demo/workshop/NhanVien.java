package demo.workshop;

public abstract class NhanVien {

    protected String maNhanVien;
    protected String hoTen;
    protected String ngaySinh;
    protected boolean gioiTinh;
    protected ThongTinLienHe thongTinLienHe;
    protected ThongTinHopDong thongTinHopDong;

    protected double luongCoBan;

    abstract double tinhLuong(XepLoai xepLoai);
}
