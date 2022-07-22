
package com.poly.entity;

import java.util.Date;

public class NhanVien {
    private String MaNV;
    private String HoTen;
    private Date NamSinh;
    private Boolean GioiTinh;
    private String DiaChi;
    private String Email;
    private String SDT;
    private String Hinh;

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public Date getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(Date NamSinh) {
        this.NamSinh = NamSinh;
    }

    public Boolean getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(Boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "MaNV=" + MaNV + ", HoTen=" + HoTen + ", NamSinh=" + NamSinh + ", GioiTinh=" + GioiTinh + ", DiaChi=" + DiaChi + ", Email=" + Email + ", SDT=" + SDT + ", Hinh=" + Hinh + '}';
    }
    
    
}
