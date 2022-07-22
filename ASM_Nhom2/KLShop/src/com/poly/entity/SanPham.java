
package com.poly.entity;

public class SanPham {
    
    private Integer MaSP;
    private String TenSP;
    private Integer Loai;
    private Double DonGia;
    private Integer SoLuong;
    private String MoTa;
    private String Hinh;
    private Integer KichThuoc;

    public Integer getMaSP() {
        return MaSP;
    }

    public void setMaSP(Integer MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public Integer getLoai() {
        return Loai;
    }

    public void setLoai(Integer Loai) {
        this.Loai = Loai;
    }

    public Double getDonGia() {
        return DonGia;
    }

    public void setDonGia(Double DonGia) {
        this.DonGia = DonGia;
    }

    public Integer getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(Integer SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public Integer getKichThuoc() {
        return KichThuoc;
    }

    public void setKichThuoc(Integer KichThuoc) {
        this.KichThuoc = KichThuoc;
    }

    @Override
    public String toString() {
        return "SanPham{" + "MaSP=" + MaSP + ", TenSP=" + TenSP + ", Loai=" + Loai + ", DonGia=" + DonGia + ", SoLuong=" + SoLuong + ", MoTa=" + MoTa + ", Hinh=" + Hinh + ", KichThuoc=" + KichThuoc + '}';
    }

  
    
    
}
