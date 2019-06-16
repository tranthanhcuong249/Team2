package qlnv_cs311b;

import java.util.Date;

public class CanBoQuanLy extends NhanVien {
    private String chucVu;
    private double phuCapChucVu;

    public CanBoQuanLy(String chucVu, double phuCapChucVu, String maNV, String hoTen, double heSoLuong, Date ngayVaoLam, boolean phai) {
        super(maNV, hoTen, heSoLuong, ngayVaoLam, phai);
        this.chucVu = chucVu;
        this.phuCapChucVu = phuCapChucVu;
    }


    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getPhuCapChucVu() {
        return phuCapChucVu;
    }

    public void setPhuCapChucVu(double phuCapChucVu) {
        this.phuCapChucVu = phuCapChucVu;
    }

    @Override
    public String toString() {
        return "CanBoQuanLy:" + super.toString() + "chucVu=" + chucVu + ", phuCapChucVu=" + phuCapChucVu;
    }
    public double tinhLuong() {
        return this.heSoLuong * 1050000 + this.phuCapChucVu + this.phuCapThamNien();
    }
    public double thuong() {
        return this.soNam() * 100000;
    }
    }
