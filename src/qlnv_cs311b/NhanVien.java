/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnv_cs311b;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author PC
 */
public abstract class NhanVien implements INhanvien { //fix make class
    protected String maNV, hoTen;
    protected double heSoLuong;
    protected Date ngayVaoLam; //fix lỗi until.java
    protected boolean phai;
    // Phát sinh phương thức khỏi tạo, get, set,toString
    // Click phải chọn insert code -  chọn construstor để khởi tạo, getter & setter để get-set, toString() để toString.

    public NhanVien(String maNV, String hoTen, double heSoLuong, Date ngayVaoLam, boolean phai) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.heSoLuong = heSoLuong;
        this.ngayVaoLam = ngayVaoLam;
        this.phai = phai;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public Date getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public boolean isPhai() {
        return phai;
    }

    public void setPhai(boolean phai) {
        this.phai = phai;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", hoTen=" + hoTen + ", heSoLuong=" + heSoLuong + ", ngayVaoLam=" + ngayVaoLam + ", phai=" + phai + '}';
    }
    public int soNam () {
        return (int) ((Calendar.getInstance().getTime().getTime()- this.ngayVaoLam.getTime())/1000/60/60/24/365);
    }
    public double phuCapThamNien() {
        return this.soNam()*200000;
    }
    public abstract double thuong();
}
//Đạt là con cún con...:))
