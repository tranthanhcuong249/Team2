/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnv_cs311b;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class QLNV_CS311B {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        // TODO code application logic here
        
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
           System.out.println("Nhap ngay vao lam: ");
           String ngay = k.nextLine();
           DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
           Date ngayVao =  new Date();
           try {
               ngayVao = df.parse(ngay);
           } catch (ParseException e) {}
            //ngay = df.parse(k.nextLine());
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
                v = new CanBoQuanLy(cvu, pccv, ma , ht, hsl, ngayVao, phai);
            } 
            else {
                System.out.println("Nhap cong viec: ");
                String cv = k.nextLine();
                v = new ChuyenVien(cv, ma, ht, hsl, ngayVao, phai) ;
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
    
}
