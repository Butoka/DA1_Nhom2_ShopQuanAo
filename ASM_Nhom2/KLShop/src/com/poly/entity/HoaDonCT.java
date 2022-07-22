
package com.poly.entity;

public class HoaDonCT {
    private Long MaHDCT;
    private Long MaHD;
    private Integer MaSP;
//    private Double DonGia;
    private Integer SoLuong;

    public Long getMaHDCT() {
        return MaHDCT;
    }

    public void setMaHDCT(Long MaHDCT) {
        this.MaHDCT = MaHDCT;
    }

    public Long getMaHD() {
        return MaHD;
    }

    public void setMaHD(Long MaHD) {
        this.MaHD = MaHD;
    }

    public Integer getMaSP() {
        return MaSP;
    }

    public void setMaSP(Integer MaSP) {
        this.MaSP = MaSP;
    }

//    public Double getDonGia() {
//        return DonGia;
//    }
//
//    public void setDonGia(Double DonGia) {
//        this.DonGia = DonGia;
//    }

    public Integer getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(Integer SoLuong) {
        this.SoLuong = SoLuong;
    }

    @Override
    public String toString() {
        return "HoaDonCT{" + "MaHDCT=" + MaHDCT + ", MaHD=" + MaHD + ", MaSP=" + MaSP + ", SoLuong=" + SoLuong + '}';
    }

   
    
    
}
