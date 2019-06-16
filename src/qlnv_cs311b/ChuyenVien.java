package qlnv_cs311b;

import java.util.Date;

/**
 *
 * @author PC
 */
public class ChuyenVien extends NhanVien {
    private String congViec;

    public ChuyenVien(String congViec, String maNV, String hoTen, double heSoLuong, Date ngayVaoLam, boolean phai) {
        super(maNV, hoTen, heSoLuong, ngayVaoLam, phai);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }


    @Override
    public String toString() {
        return "ChuyenVien" + super.toString() + "congViec=" + congViec;
    }
    public double tinhLuong() {
        return this.heSoLuong*1050000 + this.phuCapThamNien();
    }
    public double thuong() {
        return this.soNam()*50000;
    }
}
