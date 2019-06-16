/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnv_cs311b;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class DSNhanVien {
    private ArrayList <NhanVien> m = new ArrayList <NhanVien>();
    //thêm nhân viên
    public void them (NhanVien v) {
        m.add(v);
    }
    //chèn phần tử vào vị trí i
    public void chen (int i, NhanVien v) {
        m.add(i, v);
    }
    //xóa phần tử thứ i
    public NhanVien xoa(int i, NhanVien v) {
        return m.set(i, v);
    }
    //Hiển thị danh sách nhân viên bao gồm lương
    public String xuat() {
        String s ="";
        for(NhanVien v: m)
            s += v.toString() + v.tinhLuong() + v.thuong() + "\n";
        return s;
    }
    //nhân viên cuối cùng có lương cao nhất
    public int timMaxLuong() {
        int max = 0;
        for(int i = 0; i < m.size(); i++) 
            if(m.get(i).tinhLuong() >= m.get(max).tinhLuong())
                max = i;
        return max;
    }
    //tính tổng lương các chuyên viên
    public String tong() {
        String s = "";
        for(NhanVien v:m)
            if(v instanceof ChuyenVien)
                s = s + v.toString() + v.tinhLuong() + v.thuong() + "\n";
        return s;
    }
    //trung binh luong cua chuyen vien
    public double trungBinhLuong() {
        double s = 0;
        int dem = 0;
        for(NhanVien v:m)
            if(v instanceof ChuyenVien) {
                s = s + v.tinhLuong();
                dem++;
            }
        if (dem == 0)
            return 0;
        else
            return s/dem;
    }
    //tìm nhân viên có mã chỉ định
    public NhanVien tim(String ma) {
        for (NhanVien v:m)
            if(ma.equals(v.getMaNV()))
                return v;
        return null;        
    }
    //tìm nhân viên có phải chỉ định
    public String timPhai(boolean phai) {
        String s = "";
        for(NhanVien v:m)
            if(phai == v.isPhai()) 
                s = s + v.toString() + "\n";
        return s;
    }
    //xóa nhân viên có mã chỉ định
    public void xoaNV (String ma) {
        for (NhanVien v:m)
            if(ma.equals(v.getMaNV())) {
                m.remove(v);
                break;
            }
    }
    //tìm nhân viên có tên chỉ định
    public String timHoTen (String hoTen) {
        String s = "";
        for(NhanVien v:m)
            if(hoTen.equals(v.getHoTen()))
                s = s + v.toString() + "\n";
        return s;
    }
        public String hienThi() {
        String s = "";
        for (NhanVien v:m)
            s += v.toString();
        return s;
    }
    //Hiển thị tổng tiền lương mà cơ quan trả cho toàn bộ nhân viên
    
    /*
    for (int i=0; i<m.size(); i++)
        m.get(i);
    for (NhanVien v:m)
        v;
    */
   /* public static void main (String[] args) {
        DSNhanVien m = new DSNhanVien();
        Scanner k = new Scanner(System.in);
        System.out.println("Nhap so nhan vien can them: ");
        int sonv = k.nextInt();
        k.nextLine();
        for(int i = 0; i < sonv; i++) {
            System.out.println("Nhap Can bo quan ly hay Chuyen vien (q/v): ");
            char s = k.nextLine().charAt(0);
            System.out.println("Ma: ");
            String ma = k.nextLine();
            System.out.println("Ho Ten: ");
            String ht = k.nextLine();
            System.out.println("Nhap he so luong: ");
            double hsl = k.nextDouble();
            //double hsl = Double.parseDouble(k.nextLine());
            Date ngay = new Date();
            DateFormat df = new SimpleDateFormat("d/m/yyyy");
            System.out.println("Nhap ngay vao lam: ");
            try {
                ngay = df.parse(k.nextLine());
            } catch (ParseException ex) {}
            System.out.println("Nhap phai 1(nam) 0(nu): ");
            boolean phai = true;
            int p = k.nextInt();
            if (p == 0)
                phai = false;
            NhanVien v;
            if(s == 'q') {
                System.out.println("Nhap chuc vu: ");
                String cvu = k.nextLine();
                System.out.println("Nhap phu cap chuc vu: ");
                double pccv = k.nextDouble();
                //double pccv = Double.parseDouble(k.netxLine());
                v = new CanBoQuanLy(cvu, pccv, ma , ht, hsl, ngay, phai);
            } 
            else {
                System.out.println("Nhap cong viec: ");
                String cv = k.nextLine();
                v = new ChuyenVien(cv, ma, ht, hsl, ngay, phai) ;
            }
            m.them(v);           
        }
        System.out.println("Danh sach nhan vien: " + m.xuat());
        System.out.println("Trung binh luong: " + m.tbLuong());
        System.out.println("Tong luong: " + m.tong());
        System.out.println("Nhan vien cuoi cung co luong max: " + m.tmMaxLuong());
        System.out.println("Tim phai cua nhan vien: " + m.timPhai(true));
        String hoTen = null;
        System.out.println("Tim ho ten nhan vien: " +m.timHoTen(hoTen));
        System.out.println("Xoa nhan vien: ");      
        System.out.println("Nhap ma can tim: ");
        String ma = k.nextLine();
        NhanVien v = m.tim(ma);
        if(v != null) 
            System.out.println(v.toString());
    }*/

    void sua(int i, NhanVien v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
